class Solution {
    fun solution(x: Int): Boolean {
        var sum = x.toString().sumOf { it.toString().toInt() }
        return x % sum == 0
    }
}