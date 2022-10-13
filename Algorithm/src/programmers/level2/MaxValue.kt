package programmers.level2

// https://school.programmers.co.kr/learn/courses/30/lessons/42746

private val numbers = mutableListOf(3, 30, 34, 5, 9)
private val case = mutableListOf<Int>()
private val permutationResult = mutableListOf<Int>()
private var visited = mutableListOf<Boolean>()

fun main() {

    visited = MutableList(numbers.size) { false }

    println(numbers)
    println(visited)

    permutation(0, numbers.size)

    println(permutationResult.sorted().max())
}

private fun permutation(nowPickSize: Int, pickSize: Int) {
    if (nowPickSize == pickSize) {
        val result = case.joinToString("")
        permutationResult.add(result.toInt())
        println("새로운 순열 : ${case.joinToString("") }")
        return
    }

    numbers.forEachIndexed { index, s ->
        if (!visited[index]) {
            visited[index] = true
            case.add(s)
            permutation(nowPickSize + 1, pickSize)
            case.removeLast()
            visited[index] = false
        }
    }
}