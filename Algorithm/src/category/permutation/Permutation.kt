package category.permutation

/** 순열 */
private val numList = intArrayOf(1,2,3,4,5)
private val pickedNum = mutableListOf<Int>()
private val visited = BooleanArray(numList.size) { false }

fun main() {
    permutation(0, 3)
}

private fun permutation(count: Int, depth: Int) {
    if (count == depth) {
        println(pickedNum)
    } else {
        for (i in numList.indices) {
            if (!visited[i]) {
                visited[i] = true
                pickedNum.add(numList[i])
                permutation(count + 1, depth)
                pickedNum.removeAt(pickedNum.lastIndex)
                visited[i] = false
            }
        }
    }
}