class Solution {
    fun solution(num: Int): Int {
        var n = num.toLong()
        var count = 0

        while (n != 1L && count < 500) {
            n = if (n % 2 == 0L) n / 2 else n * 3 + 1
            count++
        }
        return if (count < 500) count else -1
    }
}