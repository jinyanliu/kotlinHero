package practice8

import java.util.Scanner

/**
 * B. Yellow Cards
 * Input
 * 2
 * 3
 * 5
 * 1
 * 8
 * Output
 * 0 4
 */
fun main() {

    val scanner = Scanner(System.`in`)


    val numberOfPlayersInTeamOne = scanner.nextLine().trim().toInt()
    val numberOfPlayersInTeamTwo = scanner.nextLine().trim().toInt()
    val numberOfYCToLeaveInTeamOne = scanner.nextLine().trim().toInt()
    val numberOfYCToLeaveInTeamTwo = scanner.nextLine().trim().toInt()
    val totalCards = scanner.nextLine().trim().toInt()



    val min = mutableListOf<Int>()
    val max = mutableListOf<Int>()

    for(num in 0..totalCards){

        val team1get = num
        val team2get = totalCards-num

        if(team1get>numberOfPlayersInTeamOne*numberOfYCToLeaveInTeamOne) continue
        if(team2get>numberOfPlayersInTeamTwo*numberOfYCToLeaveInTeamTwo) continue


        var team1leaveMax = 0
        var team1leaveMin = 0


        if(team1get<numberOfYCToLeaveInTeamOne){
            team1leaveMax = 0
            team1leaveMin= 0
        }else {
            if(team1get==numberOfPlayersInTeamOne*numberOfYCToLeaveInTeamOne){
                team1leaveMax = numberOfPlayersInTeamOne
                team1leaveMin= numberOfPlayersInTeamOne
            }else {
                team1leaveMax = team1get/numberOfYCToLeaveInTeamOne
                if(numberOfYCToLeaveInTeamOne==1){
                    team1leaveMin = team1get/numberOfYCToLeaveInTeamOne
                }else {
                    team1leaveMin = team1get%(numberOfYCToLeaveInTeamOne-1)
                }
            }
        }


        var team2leaveMax = 0
        var team2leaveMin = 0


        if(team2get<numberOfYCToLeaveInTeamTwo){
            team2leaveMax = 0
            team2leaveMin= 0
        }else {
            if(team2get==numberOfPlayersInTeamTwo*numberOfYCToLeaveInTeamTwo){
                team2leaveMax = numberOfPlayersInTeamTwo
                team2leaveMin= numberOfPlayersInTeamTwo
            }else {
                team2leaveMax = team2get/numberOfYCToLeaveInTeamTwo
                if(numberOfYCToLeaveInTeamTwo==1){
                    team2leaveMin = team2get/numberOfYCToLeaveInTeamTwo
                }else {
                    team2leaveMin = team2get%(numberOfYCToLeaveInTeamTwo-1)
                }

            }
        }

        min.add(team1leaveMin+team2leaveMin)
        max.add(team1leaveMax+team2leaveMax)
    }

    println("${min.min()} ${max.max()}")
}