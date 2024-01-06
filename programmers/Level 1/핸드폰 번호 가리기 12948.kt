class Solution {
    fun solution(phone_number: String): String {
        var invisible = phone_number.length - 4
        var mask = "*".repeat(invisible)
        var visible = phone_number.takeLast(4)
        
        return mask + visible
    }
}