package programmers.level1
// https://school.programmers.co.kr/learn/courses/30/lessons/12969?language=kotlin
fun main() {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    repeat(b){
        println("*".repeat(a))
    }
}