package programmers.level1

// https://school.programmers.co.kr/learn/courses/30/lessons/72410
fun main() {
    val new_id = "z-+.^."
    var answer = ""

    answer = Regex("[^A-Za-z0-9-_.]").replace(new_id, "").toLowerCase()
    println(answer)
    answer = Regex("[.]{2,}").replace(answer, ".")
    println(answer)

    while (true) {
        answer = Regex("^[.]|[.]$").replace(answer, "")
        if (answer.isEmpty()) {
            answer = "a"
        }

        when {
            answer.length >= 16 -> {
                answer = answer.substring(0,15)
            }
            answer.length <= 2 -> {
                answer += answer[answer.length-1]
            }
            else -> {
                break
            }
        }
    }

    println(answer)
}