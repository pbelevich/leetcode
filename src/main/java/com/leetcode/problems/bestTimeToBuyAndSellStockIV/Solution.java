package com.leetcode.problems.bestTimeToBuyAndSellStockIV;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/#/description
 * <p>
 * 188. Best Time to Buy and Sell Stock IV
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int maxProfit(int k, int[] prices) {
        if (k == 0 || prices.length == 0) {
            return 0;
        }

        if (k >= prices.length >> 1) {
            return maxProfit(prices);
        }

        int[][] dp = new int[k + 1][prices.length];
        for (int t = 1; t <= k; t++) {
            int max = -prices[0];
            for (int d = 1; d < prices.length; d++) {
                dp[t][d] = Math.max(dp[t][d - 1], prices[d] + max);
                max = Math.max(max, dp[t - 1][d - 1] - prices[d]);
            }
        }
        return dp[k][prices.length - 1];
    }

    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            final int delta = prices[i] - prices[i - 1];
            if (delta > 0) {
                result += delta;
            }
        }
        return result;
    }

}
