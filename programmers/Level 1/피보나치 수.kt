class Solution {
    fun solution(n: Int): Int {
        var a = 0
        var b = 1

        repeat(n) {
            val temp = (a + b) % 1234567
            a = b
            b = temp
        }

        return a % 1234567
    }
}