class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var wMax = 0
        var hMax = 0

        for(s in sizes){
            wMax = maxOf(wMax, s[0], s[1]);
            hMax = maxOf(hMax, minOf(s[0], s[1]))
        }
        return wMax * hMax
    }
}