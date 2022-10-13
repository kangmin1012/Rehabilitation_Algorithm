package category.sort

/** 두 개의 값 자리 변경 */
fun swap(arr: MutableList<Int>, start: Int, end: Int) {
    val temp = arr[start]
    arr[start] = arr[end]
    arr[end] = temp
}