class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0

        for(i in 0 until a.size){
            answer += a[i] * b[i]   // a.size = b.size 이므로
        }

        return answer
    }
}