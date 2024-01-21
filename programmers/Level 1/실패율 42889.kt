class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val success = FloatArray(N + 1)
        val challenge = FloatArray(N + 1)
        val rate = FloatArray(N)

        for (i in stages.indices) {
            for (j in 0 until stages[i]) {
                challenge[j]++
                if (j != stages[i] - 1) success[j]++
            }
        }
        for (i in 0 until N) {
            if (challenge[i] == 0f) rate[i] = 0f
            else rate[i] = (challenge[i] - success[i]) / challenge[i]
        }
        val map = mutableMapOf<Int, Float>()
        for (i in 1..N) map[i] = rate[i - 1]

        val sorted = map.toList().sortedByDescending { it.second }.toMap()
        return sorted.keys.toIntArray()
    }
}