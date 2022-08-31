package programmers.level1
// https://school.programmers.co.kr/learn/courses/30/lessons/70128
fun main() {
    val a = intArrayOf(1,2,3,4)
    val b = intArrayOf(-3,-1,0,2)
    var answer = 0

    a.forEachIndexed { index, n ->
        answer += (n * b[index])
    }

    println(answer)
}