package com.leetcode.problems.bestTimeToBuyAndSellStockII;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/#/description
 * <p>
 * 122. Best Time to Buy and Sell Stock II
 *
 * @author Pavel Belevich
 */
public class Solution {

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
