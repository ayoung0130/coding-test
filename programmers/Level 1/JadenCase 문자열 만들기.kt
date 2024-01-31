class Solution {
    fun solution(s: String): String {
        val word = s.split(" ")

        val jadenCaseWord = word.map { word ->
            if (word.isNotEmpty()) {
                word[0].uppercaseChar() + word.substring(1).toLowerCase()
            } else {
                ""
            }
        }
        return jadenCaseWord.joinToString(" ")
    }
}