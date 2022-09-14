package programmers.level1

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/87389
 * 월간 코드 챌린지 시즌3*/
fun main() {
    println(Remainder1Solution().solution(10).toString())
}

class Remainder1Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        kotlin.run {
            (2 until n).forEach { divider ->
                if (n % divider == 1) {
                    answer = divider
                    return@run
                }
            }
        }

        return answer
    }
}
