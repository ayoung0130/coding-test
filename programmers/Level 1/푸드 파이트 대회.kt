class Solution {
    fun solution(food: IntArray): String {
        var answer = ""
        for(i in 1 until food.size){
            println(food[i]/2)
            answer += i.toString().repeat(food[i]/2)

        }
        return answer + "0" + answer.reversed()
    }
}