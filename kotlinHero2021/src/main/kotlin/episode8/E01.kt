package episode8

import java.util.Scanner

/* Input:
4
>>>
<><=<
=
<<==
*/

/* Output:
>
?
=
<
*/

fun main() {

    val scanner = Scanner(System.`in`)
    val numberOfCases = scanner.nextLine().trim().toInt()

    for (i in 1..numberOfCases) {
        val case = scanner.nextLine()
        if (case.contains("<") && case.contains(">")) {
            println("?")
        } else if (case.contains("=") && !case.contains("<") && !case.contains(">")) {
            println("=")
        } else if (case.contains("<") && !case.contains(">")) {
            println("<")
        } else if (case.contains(">") && !case.contains("<")) {
            println(">")
        }
    }
}