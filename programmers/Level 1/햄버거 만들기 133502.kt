import java.util.Stack

class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0 
        val s = Stack<Int>()

        for (i in ingredient) {
            s.push(i)

            if (s.size >= 4) {
                val peek1 = s.peek()
                s.pop()
                val peek2 = s.peek()
                s.pop()
                val peek3 = s.peek()
                s.pop()
                val peek4 = s.peek()
                s.pop()

                if ((peek4 == 1) && (peek3 == 2) && (peek2 == 3) && (peek1 == 1)) answer++
                else {
                    s.push(peek4)
                    s.push(peek3)
                    s.push(peek2)
                    s.push(peek1)
                }
            }
        }
        return answer
    }
}