class Solution {
    fun solution(s: String, n: Int): String =
        s.map {
            when {
                it.isLowerCase() -> ('a' + (it - 'a' + n) % 26).toChar()
                it.isUpperCase() -> ('A' + (it - 'A' + n) % 26).toChar()
                else -> ' '
            }
        }.joinToString ("")
}