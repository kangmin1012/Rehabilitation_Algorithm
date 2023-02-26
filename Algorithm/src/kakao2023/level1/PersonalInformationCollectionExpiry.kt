package kakao2023.level1

import java.util.*

// https://school.programmers.co.kr/learn/courses/30/lessons/150370
class PersonalInformationCollectionExpiry {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val answer = mutableListOf<Int>()

        val termsMap = mutableMapOf<String, Int>() // A to 유효기간(int)
        terms.forEach { term ->
            val a = term.split(" ") // [A, 유효기간(string)]
            termsMap[a[0]] = a[1].toInt()
        }

        val splitToday = today.split(".") // [YYYY, MM, DD]
        val todayY = splitToday[0].toInt()
        val todayM = splitToday[1].toInt()
        val todayD = splitToday[2].toInt()

        privacies.forEachIndexed { index, privacy ->
            val info = privacy.split(" ")
            val expirySplit = info[0].split(".")
            val term = termsMap[info[1]] ?: 0

            val expiryCalendar = GregorianCalendar().apply {
                set(Calendar.YEAR, expirySplit[0].toInt())
                set(Calendar.MONTH, expirySplit[1].toInt() - 1)
                set(
                    Calendar.DAY_OF_MONTH,
                    if (expirySplit[2].toInt() == 1) {
                        28
                    } else {
                        expirySplit[2].toInt() - 1
                    }
                )

                add(
                    Calendar.MONTH,
                    if (expirySplit[2].toInt() == 1) {
                        term - 1
                    } else {
                        term
                    }
                )
            }

            val expiryY = expiryCalendar.get(Calendar.YEAR)
            val expiryM = expiryCalendar.get(Calendar.MONTH) + 1
            val expiryD = expiryCalendar.get(Calendar.DAY_OF_MONTH)

            when {
                expiryY < todayY -> {
                    answer.add(index + 1)
                }

                (expiryY == todayY && expiryM < todayM) -> {
                    answer.add(index + 1)
                }

                (expiryY == todayY && expiryM == todayM && expiryD < todayD) -> {
                    answer.add(index + 1)
                }
            }
        }

        return answer.toIntArray()
    }
}

fun main() {
    val today = "2022.05.19"
    val terms = listOf(
        "A 6",
        "B 12",
        "C 3"
    )
    val privacies = listOf(
        "2021.05.02 A",
        "2021.07.01 B",
        "2022.02.19 C",
        "2022.02.20 C"
    )

    val answer = PersonalInformationCollectionExpiry().solution(today, terms.toTypedArray(), privacies.toTypedArray())
    println(answer.contentToString())
}