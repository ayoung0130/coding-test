import java.util.Stack

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        var box = Stack<Int>()

        moves.forEach {
            for (i in board.indices) {
                if (board[i][it - 1] != 0) {
                    if (!box.empty() && box.peek() == board[i][it - 1]) {
                        answer += 2
                        box.pop()
                    } else {
                        box.push(board[i][it - 1])
                    }
                    board[i][it - 1] = 0
                    break
                }
            }
        }
        return answer
    }
}