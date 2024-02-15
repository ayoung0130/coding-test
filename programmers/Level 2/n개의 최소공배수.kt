class Solution {
    fun solution(arr: IntArray): Int {
        var lcm = 1

        arr.forEach { num ->
            val gcd = gcd(lcm, num)
            lcm = lcm * num / gcd
        }

        return lcm
    }

    fun gcd(a: Int, b: Int): Int {
        // 유클리드 호제법
        return if (b == 0) a else gcd(b, a % b)
    }
}