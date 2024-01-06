class Solution {
    fun solution(n: Long): IntArray {
        val num = n.toString()
        val answer = IntArray(num.length)

        for(i in num.indices) {
            answer[i] = num[num.length - i - 1] - '0'
        }
        return answer
    }
}