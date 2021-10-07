package episode8

import java.util.Scanner

/* Input:
4
1
1 1
100 1
99
4
10 1
20 4
16
100
1 1
100 100
42
100
1 1
100 2
99
*/

/* Output:
1
2
42
1
*/

fun main() {
    val resultList = arrayListOf<Int>()

    val scanner = Scanner(System.`in`)
    val numberOfCases = scanner.nextLine().trim().toInt()

    for (i in 1..numberOfCases) {
        val howManyVolumes = scanner.nextLine()
        val (day1, volume1) = scanner.nextLine().split(' ').map { it.toInt() }
        val (day2, volume2) = scanner.nextLine().split(' ').map { it.toInt() }
        val onDay = scanner.nextLine()

        if (volume1 == volume2) {
            resultList.add(volume1)
        } else if ((volume2 - volume1) == (day2 - day1)) {
            resultList.add(onDay.toInt() - day1 + volume1)
        } else {
            if ((day2 - onDay.toInt()) < volume2 - volume1) {
                resultList.add(volume2 - (day2 - onDay.toInt()))
            } else {
                resultList.add(volume1)
            }

        }
    }

    for (result in resultList) {
        println(result)
    }
}