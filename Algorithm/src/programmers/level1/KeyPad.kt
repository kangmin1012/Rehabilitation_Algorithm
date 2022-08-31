package programmers.level1

import kotlin.math.abs
// https://school.programmers.co.kr/learn/courses/30/lessons/67256
fun main() {
    val hand = "right"
    val numbers = intArrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5) // result : LRLLLRLLRRL

    var rightPosition = 10 // *을 10으로 변경
    var leftPosition = 12 // #을 11로 변경

    var result = ""

    numbers.forEach { number ->
        when(number) {
            1,4,7 -> {
                result += "L"
                leftPosition = number
            }

            3,6,9 -> {
                result += "R"
                rightPosition = number
            }

            else -> {
                val target = if (number == 0) 11 else number

                val rightDistance = abs(rightPosition - target) % 3 + abs(rightPosition - target) / 3
                val leftDistance = abs(leftPosition - target) % 3 + abs(leftPosition - target) / 3

                if (rightDistance > leftDistance) {
                    result += "L"
                    leftPosition = target
                } else if (rightDistance < leftDistance) {
                    result += "R"
                    rightPosition = target
                } else {
                    if (hand == "right") {
                        result += "R"
                        rightPosition = target
                    } else {
                        result += "L"
                        leftPosition = target
                    }
                }
            }
        }
    }

    println(result)
}