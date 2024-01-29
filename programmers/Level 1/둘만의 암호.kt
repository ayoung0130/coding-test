class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer = ""
        var skipped = skip
        var word = ('a'..'z').filter { it !in skipped }

        s.forEach {
            var i = (word.indexOf(it) + index) % word.size
            answer += word[i]
        }
        return answer
    }
}