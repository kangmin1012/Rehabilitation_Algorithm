package programmers.level1

import kotlin.math.abs

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/118666
 * 2022 kakao tech internship
 * */

fun main() {
    val survey = arrayListOf("AN", "CF", "MJ", "RT", "NA")
    val choices = arrayListOf(5, 3, 2, 7, 5)

    val mbtiCase = mutableMapOf("R" to 0, "T" to 0, "C" to 0, "F" to 0, "J" to 0, "M" to 0, "A" to 0, "N" to 0)

    var result = ""
    survey.forEachIndexed { index, case ->
        val splitCase = case.toList().map { it.toString() }
        val positiveCaseCount = mbtiCase[splitCase[1]] ?: 0
        val negativeCaseCount = mbtiCase[splitCase[0]] ?: 0

        if (choices[index] - 4 > 0) {
            mbtiCase[splitCase[1]] = positiveCaseCount + (choices[index] - 4)
        } else {
            mbtiCase[splitCase[0]] = negativeCaseCount + abs(choices[index] - 4)
        }
    }

    result += if ((mbtiCase["R"] ?: 0) >= (mbtiCase["T"] ?: 0)) "R" else "T"
    result += if ((mbtiCase["C"] ?: 0) >= (mbtiCase["F"] ?: 0)) "C" else "F"
    result += if ((mbtiCase["J"] ?: 0) >= (mbtiCase["M"] ?: 0)) "J" else "M"
    result += if ((mbtiCase["A"] ?: 0) >= (mbtiCase["N"] ?: 0)) "A" else "N"

    println(result)
}