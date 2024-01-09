class Solution {
    fun solution(numbers: IntArray): Int {
        val allNum = setOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val ghostNum = allNum - numbers.toSet()

        return ghostNum.sum()
    }
}