package com.leetcode.problems.bestTimeToBuyAndSellStock;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/#/description
 * <p>
 * 121. Best Time to Buy and Sell Stock
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int maxCurr = 0;
        int maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCurr = Math.max(0, maxCurr + (prices[i] - prices[i - 1]));
            maxSoFar = Math.max(maxCurr, maxSoFar);
        }
        return maxSoFar;
    }

}
