package programmers.level1

// https://school.programmers.co.kr/learn/courses/30/lessons/77484
fun main() {
    val lottos = intArrayOf(44, 1, 0, 0, 31, 25)
    val win_nums = intArrayOf(31,10,45,1,6,19)

    val deletedCount = lottos.count { it == 0 } // 지워진 번호
    val prizeCount = lottos.filter { it != 0 }.count { it in win_nums } // 당첨된 번호

    val highestRanking = when(prizeCount + deletedCount) {
        0,1 -> 6
        2 -> 5
        3 -> 4
        4 -> 3
        5 -> 2
        else -> 1
    }

    val lowestRanking = when(prizeCount) {
        0,1 -> 6
        2 -> 5
        3 -> 4
        4 -> 3
        5 -> 2
        else -> 1
    }

    println(listOf(highestRanking, lowestRanking))
}