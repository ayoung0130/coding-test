class Solution {
    fun solution(n: Int, m: Int): IntArray {
        return intArrayOf(myFun(n, m), ((n*m)/myFun(n,m)))
    }
    private tailrec fun myFun(n: Int, m: Int): Int {
        return if (m > n) {
            if (n == 0) m else myFun(n, m % n)
        } else {
            if (m == 0) n else myFun(n % m, m)
        }
    }
}