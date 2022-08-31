package programmers.level1
// https://school.programmers.co.kr/learn/courses/30/lessons/81301
fun main() {
    var s = "one4seveneight" // result : 1478
    val numberMap = mapOf(
        "zero" to 0,
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9
    )

    numberMap.forEach { (string, number) ->
        s = s.replace(string, number.toString())
    }

    println(s)
}