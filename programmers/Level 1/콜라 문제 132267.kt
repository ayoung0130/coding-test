class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var num = n

        while (num >= a) {
            var r = num % a
            
            num = (num - r) / a * b
            answer += num
            num += r
        }
        return answer
    }
}