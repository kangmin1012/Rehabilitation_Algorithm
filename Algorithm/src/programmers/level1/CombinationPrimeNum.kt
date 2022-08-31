package programmers.level1

import kotlin.math.sqrt

// https://school.programmers.co.kr/learn/courses/30/lessons/12977
fun main() {
    val nums = intArrayOf(1,2,3,4)
    val answer = mutableListOf<List<Int>>()

    getCombination(answer, nums, BooleanArray(nums.size){false}, 0, 3)

    println(answer.filter { isPrime(it.sum()) }.size)
}

fun getCombination(
    result: MutableList<List<Int>>,
    c: IntArray,
    choices: BooleanArray,
    startIndex: Int,
    choiceCount: Int
) {
    if (choiceCount == 0) {
        result.add(
            c.filterIndexed { index, _ -> choices[index] }
        )
    } else {
        for (i in startIndex until c.size) {
            choices[i] = true
            getCombination(result, c, choices, i + 1, choiceCount - 1)
            choices[i] = false
        }
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false

    return (2..sqrt(num.toDouble()).toInt()).none { num % it == 0 }
}