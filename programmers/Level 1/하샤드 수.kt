class Solution {
    fun solution(x: Int): Boolean {
        val sum = x.toString().sumOf { it.toString().toInt() }

        return x % sum == 0
    }
}