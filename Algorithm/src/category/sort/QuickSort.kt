package category.sort

/** Quick Sort
 * 배열을 2개의 파티션으로 나누어 기준점보다 작은 값은 왼쪽으로, 큰 값은 오른쪽으로 옮기는 행위를 반복하여 정렬하는 방법*/

fun main() {
    val array = mutableListOf(3, 9, 4, 7, 0, 1, 5, 8, 6, 2)
    println(array)
    quickSort(array, 0, array.size - 1)
    println(array)
}

/** 퀵 정렬 진행하는 함수
 * 파티션은 오른쪽 -> 왼쪽 순으로 정렬 진행 */
private fun quickSort(arr: MutableList<Int>, start: Int, end: Int) {
    val rightPartitionStart = partition(arr, start, end) // 파티션 정렬을 한 후 pivot의 오른쪽 맨 첫번째 인덱스 가져오기

    if (start < rightPartitionStart - 1) { // start 인덱스가 피봇보다 크거나 같다면 왼쪽 파티션은 데이터가 1개라 정렬할 필요가 없음
        quickSort(arr, start, rightPartitionStart - 1) // 왼쪽 파티션 quicksort 진행
    }
    if (rightPartitionStart < end) { // end 인덱스가 피봇보다 작거나 같다면 오른쪽 파티션은 데이터가 1개라 정렬할 필요가 없음
        quickSort(arr, rightPartitionStart, end) // 오른쪽 파티션 quicksort 진행
    }
}

/** 하나의 파티션에서 피봇을 정하고 정렬 진행 */
private fun partition(arr: MutableList<Int>, start: Int, end: Int): Int {
    val pivot = arr[(start + end) / 2] // pivot 값
    var startIndex = start // 왼쪽부터 시작하는 인덱스
    var endIndex = end // 오른쪽부터 시작하는 인덱스

    while (startIndex <= endIndex) { // 서로 맞물리거나 어긋날때까지 진행
        while (arr[startIndex] < pivot) { // start쪽 값이 pivot보다 클 때까지 인덱스 이동
            startIndex++
        }
        while (arr[endIndex] > pivot) { // end쪽 값이 pivot보다 작을 때까지 인덱스 이동
            endIndex--
        }

        if (startIndex <= endIndex) {
            swap(arr, startIndex, endIndex) // start, end 위치의 값을 swap
            // 다음 값 정렬을 위한 인덱스 이동
            startIndex++
            endIndex--
        }
    }
    return startIndex // 정렬이 완료된 후 pivot을 중심으로 한 오른쪽 파티션 시작 위치 반환
}

/** 두 개의 값 자리 변경 */
private fun swap(arr: MutableList<Int>, start: Int, end: Int) {
    val temp = arr[start]
    arr[start] = arr[end]
    arr[end] = temp
}