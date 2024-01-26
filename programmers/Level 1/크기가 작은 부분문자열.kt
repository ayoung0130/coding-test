class Solution {
    fun solution(t: String, p: String): Int {
        var answer = 0
        var dividedString = t.windowed(p.length, 1, false)

        for (i in dividedString.indices) {
            if (dividedString[i] <= p) {
                answer++
            }
        }
        return answer
    }
}