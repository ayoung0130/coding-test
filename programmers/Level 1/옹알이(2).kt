class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer = 0
        var possible = arrayOf("aya", "ye", "woo", "ma")

        for (word in babbling) {
            var temp = word
            for (i in possible.indices) {
                if (temp.contains(possible[i] + possible[i])) {
                    continue
                } else {
                    temp = temp.replace(possible[i], " ")
                }
            }
            if (temp.replace(" ", "") == "") answer++
        }
        return answer
    }
}