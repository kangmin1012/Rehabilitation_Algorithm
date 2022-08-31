package programmers.level1

// https://school.programmers.co.kr/learn/courses/30/lessons/86051
fun main() {
    val numbers = intArrayOf(1,2,3,4,6,7,8,0)
    val numberList = listOf(0,1,2,3,4,5,6,7,8,9)

    println(numberList.filter { !numbers.contains(it) }.sum())
}