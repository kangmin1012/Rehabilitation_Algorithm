package programmers.level1

// https://school.programmers.co.kr/learn/courses/30/lessons/76501

fun main() {
    val absolutes = intArrayOf(4,7,12)
    val signs = booleanArrayOf(true, false, true)

    var answer = 0

    absolutes.forEachIndexed { index, number ->
        if (signs[index]) {
            answer += number
        } else {
            answer -= number
        }
    }

    println(answer)
}