import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val queue: Queue<Int> = LinkedList()
        var leftDay: Int
        val result = mutableListOf<Int>()

        // 각 작업 완료까지 남은 일수를 큐에 추가
        for (i in progresses.indices) {
            leftDay = (100 - progresses[i]) / speeds[i]
            if ((100 - progresses[i]) % speeds[i] != 0) {
                leftDay++
            }
            queue.add(leftDay)
        }

        // 작업 진행 상황 계산
        while (queue.isNotEmpty()) {
            var count = 1
            val first = queue.poll()

            // 현재 작업보다 빨리 끝나는 작업들 카운트
            while (queue.isNotEmpty() && queue.peek()!! <= first!!) {
                queue.remove()
                count++
            }
            result.add(count)
        }
        return result.toIntArray()
    }
}