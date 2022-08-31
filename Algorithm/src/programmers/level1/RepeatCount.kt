package programmers.level1

// https://school.programmers.co.kr/learn/courses/30/lessons/12954
fun main() {
    val x: Int = -4
    val y: Int = 2

    val answer = mutableListOf<Long>()

    (1 .. y).forEach { i ->
        answer.add(x.toLong() * i)
    }

    println(answer.toLongArray().contentToString())
}