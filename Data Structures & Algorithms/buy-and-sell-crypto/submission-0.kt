class Solution {
    fun maxProfit(prices: IntArray): Int {
        val n = prices.size
        var l = 0
        var r = 1
        var profit = 0

        while (r < n) {
            val cProfit = prices[r] - prices[l] 
            profit = maxOf(profit , cProfit)

            if (prices[r] < prices[l]) {
                l = r
            }

            r++
        }

        return profit
    }
}
