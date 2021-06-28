package practice7

import java.util.*

/**
 * B. Frog Jumping
 * Input
 * 6
 * 5 2 3
 * 100 1 4
 * 1 10 5
 * 1000000000 1 6
 * 1 1 1000000000
 * 1 1 999999999
 * Output
 * 8
 * 198
 * -17
 * 2999999997
 * 0
 * 1
 */
fun main() {
    val resultList = arrayListOf<Long>()
    val scanner = Scanner(System.`in`)
    val numberOfCases = scanner.nextLine().trim().toInt()

    for (i in 1..numberOfCases) {
        val (a, b, k) = scanner.nextLine().split(' ').map { it.toLong() }
        val plusCount = k / 2 + k % 2
        val minusCount = k / 2

        resultList.add((a * plusCount) - (b * minusCount))
    }

    for (result in resultList) {
        println(result)
    }
}