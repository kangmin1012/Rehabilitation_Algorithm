package programmers.level1

// https://school.programmers.co.kr/learn/courses/30/lessons/92334
fun main() {
    val id_list = arrayListOf("muzi", "frodo", "apeach", "neo")
//    val id_list = arrayListOf("ryan", "coon")
    val report = arrayListOf("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi")
//    val report = arrayListOf("ryan coon","ryan coon","ryan coon")
    val k = 2
//
//    var answer = mutableListOf<Int>()
//
//    val reportMap = mutableMapOf<String, MutableList<String>>()
//    val countMap = mutableMapOf<String, Int>()
//
//    // 신고 map init
//    id_list.forEach { id ->
//        reportMap[id] = mutableListOf()
//        countMap[id] = 0
//    }
//
//    report.forEach { reportString ->
//        val reportInfo = reportString.split(" ") // [신고한 유저, 신고당한 유저]
//        if (reportInfo[1] in (reportMap[reportInfo[0]] ?: mutableListOf())) { // 동일 유저가 중복해서 신고했을 경우 취소
//            println("${reportInfo[1]} in ${reportMap[reportInfo[0]]}")
//            return@forEach
//        }
//
//        countMap[reportInfo[1]] = (countMap[reportInfo[1]] ?: 0) + 1 // 신고당한 유저 카운트 1 증가
//
//        reportMap[reportInfo[0]]?.let {
//            it.add(reportInfo[1])
//            reportMap[reportInfo[0]] = it.distinct().toMutableList()
//        }
//
//        println("reportMap : $reportMap")
//        println("countMap : $countMap")
//    }
//
//
//    val reportedUser = countMap.filter { it.value >= k }.map { it.key }
//
//    println("정지 유저 : $reportedUser")
//
//    reportMap.values.forEach { reportMembers ->
//        answer.add(reportMembers.filter { it in reportedUser }.size)
//    }
//
//    println(answer)

    println(
        report.map { it.split(" ") }
        .groupBy { it[1] }
            .asSequence()
            .map { it.value.distinct() }
            .filter { it.size >= k }
            .flatten()
            .map { it[0] }
            .groupingBy { it }
            .eachCount()
            .run { id_list.map { getOrDefault(it,0) }.toList() }
    )

}