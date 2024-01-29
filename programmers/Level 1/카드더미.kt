class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var i1 = 0
        var i2 = 0

        goal.forEach {
            if (i1 < cards1.size && cards1[i1] == it) {
                i1++
            } else if (i2 < cards2.size && cards2[i2] == it) {
                i2++
            } else {
                return "No"
            }
        }
        return "Yes"
    }
}