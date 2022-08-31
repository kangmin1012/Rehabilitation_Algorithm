package programmers.level1

import kotlin.math.max

// https://school.programmers.co.kr/learn/courses/30/lessons/86491
fun main() {
    val sizes: Array<IntArray> = arrayOf(
        intArrayOf(60, 50),
        intArrayOf(30, 70),
        intArrayOf(60, 30),
        intArrayOf(80, 40)
    )
    val maxSize = mutableListOf<Int>()
    val minSize = mutableListOf<Int>()

    sizes.forEach {
        maxSize.add(if (it[0] > it[1]) it[0] else it[1])
        minSize.add(if (it[0] > it[1]) it[1] else it[0])
    }

    println((maxSize.maxOrNull() ?: 0) * (minSize.maxOrNull() ?: 0))

}