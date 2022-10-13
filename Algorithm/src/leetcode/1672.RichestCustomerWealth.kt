package leetcode

import kotlin.math.max

fun main() {
    val accounts = arrayOf(intArrayOf(1,2,3), intArrayOf(3,2,1))
    var result = 0

    accounts.forEach {
        result = max(result, it.sum())
    }

    println(result.toString())
}