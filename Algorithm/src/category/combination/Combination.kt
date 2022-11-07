package category.combination

/** 조합 */
private val numList = intArrayOf(1,2,3,4,5)
private val pickedNum = mutableListOf<Int>()

fun main() {
    combination(0, 3, 0)
}

private fun combination(count: Int, depth: Int, startIndex: Int) {
    if (count == depth) {
        println(pickedNum)
    } else {
        for (i in startIndex until numList.size) {
            pickedNum.add(numList[i])
            combination(count + 1, depth, i + 1)
            pickedNum.removeAt(pickedNum.lastIndex)
        }
    }
}