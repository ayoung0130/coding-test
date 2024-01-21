class Solution {
    fun solution(s: String): Int {
        val nums =
            arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var s1 = s
        for (i in nums.indices) {
            s1 = s1.replace(nums[i], i.toString())
        }
        return s1.toInt()
    }
}