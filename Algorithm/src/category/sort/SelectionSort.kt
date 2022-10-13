package category.sort

/** 선택정렬
 * 가장 작은 데이터를 선택하여 맨 앞으로 보내는 정렬 */
fun main() {
    val array = mutableListOf(3, 9, 4, 7, 0, 1, 5, 8, 6, 2)
    println(array)
    println("선택정렬을 시작합니다.")
    selectionSort(array)
    println(array)
}

private fun selectionSort(arr: MutableList<Int>) {

    for (i in 0 until arr.size) {
        var minValue = arr[i]
        var minIndex = i

        for (j in i until arr.size) {
            if (minValue > arr[j]) {
                minValue = arr[j]
                minIndex = j
            }
        }

        swap(arr, i, minIndex)
    }
}