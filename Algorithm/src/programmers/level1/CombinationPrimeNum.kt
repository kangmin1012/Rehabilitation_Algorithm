package programmers.level1

import kotlin.math.sqrt

// https://school.programmers.co.kr/learn/courses/30/lessons/12977
fun main() {
    val nums = intArrayOf(1,2,3,4)
    val answer = mutableListOf<List<Int>>()
    val pickedNum = mutableListOf<Int>()

    getCombination(answer, nums, pickedNum, 0, 3)

    println(answer.filter { isPrime(it.sum()) }.size)
}

fun getCombination(
    result: MutableList<List<Int>>,
    c: IntArray,
    pickedNum: MutableList<Int>,
    startIndex: Int,
    choiceCount: Int
) {
    if (choiceCount == 0) {
        println(pickedNum)
        result.add(pickedNum.map { it })
        println(result)
    } else {
        for (i in startIndex until c.size) {
            pickedNum.add(c[i])
            getCombination(result, c, pickedNum, i + 1, choiceCount - 1)
            pickedNum.removeAt(pickedNum.lastIndex)
        }
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    return (2..sqrt(num.toDouble()).toInt()).none { num % it == 0 }
}