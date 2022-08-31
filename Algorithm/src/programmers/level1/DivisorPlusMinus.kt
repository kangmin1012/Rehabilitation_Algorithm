package programmers.level1

// https://school.programmers.co.kr/learn/courses/30/lessons/77884?language=kotlin

fun main() {
    val left = 13
    val right = 17
    var answer = 0

    (left .. right).forEach {
        if (getDivisorCount(it) % 2 == 0) {
            answer += it
        } else {
            answer -= it
        }

    }

    println(answer)
}

fun getDivisorCount(num: Int): Int {
//    println("num : $num")
    var count = 0

    (1..num).forEach {
        if (num % it == 0) {
//            println("getDivisor : $it")
            count += 1
        }
    }

    return count
}