class Solution {
    fun solution(s: String): String {
        var answer = ""
        var len = s.length
        val middle = len / 2
        
        if (len % 2 == 0) {
           answer = s.substring(middle - 1, middle + 1) 
        } else {
                answer = s[middle].toString()
        }
        
        return answer
    }
}