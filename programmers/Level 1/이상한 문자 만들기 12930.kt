class Solution {
    fun solution(s: String): String {
        return s.split(" ").joinToString(" ") { word ->
            word.indices.joinToString("") { index ->
                var char = word[index]
                if (index % 2 == 0) char.toString().uppercase() else char.toString().lowercase()
            }
        }
    }
}