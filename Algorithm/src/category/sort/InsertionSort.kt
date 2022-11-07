package category.sort

/** 삽입 정렬
 * 현재 인덱스에서 그보다 아래 인덱스들과 비교하여 위치를 찾는 알고리즘 */
fun main() {
    val array = mutableListOf(3, 9, 4, 7, 0, 1, 5, 8, 6, 2)
    println(array)
    println("삽입정렬을 시작합니다.")
    insertionSort(array)
    println(array)
}

private fun insertionSort(arr: MutableList<Int>) {
    for (i in 1 until arr.size) {
        val key = arr[i]
        var j = i-1 // 키 값보다 작은 인덱스

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j]
            j--
        }
        arr[j + 1] = key
    }
}