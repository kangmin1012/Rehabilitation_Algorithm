package programmers

var answer: Long = 0 // expected answer = 5
var n: Int = 0

fun main() {
    n = 4
    val jumpList = mutableListOf<Int>()
    getCase(jumpList)
    println(answer)
}

fun getCase(jumpList: MutableList<Int>) {
    if (jumpList.sum() == n) {
        println(jumpList)
        println("plus answer")
        answer += 1
        return
    } else if (jumpList.sum() > n) {
        return
    } else {
        (1..2).forEach { i ->
            jumpList.add(i)
            getCase(jumpList)
            jumpList.removeLast()
        }
    }
}