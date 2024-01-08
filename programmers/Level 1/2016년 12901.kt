class Solution {
    fun solution(a: Int, b: Int): String {
        val dayOfWeek = listOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
        val dayInMonth = intArrayOf(0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        var totalDays = b

        for(month in 1 until a) {
            totalDays += dayInMonth[month]
        }
        val dayOfWeekIndex = (totalDays + 4) % 7

        return dayOfWeek[dayOfWeekIndex]
    }
}