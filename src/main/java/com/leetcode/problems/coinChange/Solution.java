package com.leetcode.problems.coinChange;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/coin-change/#/description
 * <p>
 * 322. Coin Change
 *
 * @author Pavel Belevich
 */
public class Solution {

    private int[] coins;
    private int[] dp;

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        this.coins = coins;
        dp = new int[amount + 1];
        for (int a = 1; a <= amount; a++) {
            dp[a] = coinChange(a);
        }
        return dp[amount];
    }

    private int coinChange(int amount) {
        int result = Integer.MAX_VALUE;
        for (int j = coins.length - 1; j >= 0; j--) {
            if (coins[j] <= amount) {
                int subResult = dp[amount - coins[j]];
                if (subResult != -1) {
                    result = Math.min(result, 1 + subResult);
                }
            }
        }
        return result != Integer.MAX_VALUE ? result : -1;
    }

}
