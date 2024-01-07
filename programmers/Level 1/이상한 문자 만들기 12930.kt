class Solution {
    fun solution(s: String): String {
        return s.split(" ").joinToString(" ") { word ->
            word.indices.joinToString("") { i ->
                var char = word[i]
                if (i % 2 == 0) char.toString().uppercase() else char.toString().lowercase()
            }
        }
    }
}