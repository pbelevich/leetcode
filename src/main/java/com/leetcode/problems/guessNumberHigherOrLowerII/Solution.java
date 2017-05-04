package com.leetcode.problems.guessNumberHigherOrLowerII;

/**
 * https://leetcode.com/problems/guess-number-higher-or-lower-ii/#/description
 * <p>
 * 375. Guess Number Higher or Lower II
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int e = 2; e <= n; e++) {
            for (int s = e - 1; s > 0; s--) {
                int globalMin = Integer.MAX_VALUE;
                for (int k = e - 1; k >= s + 1; k -= 2) {
                    int localMax = k + Math.max(dp[s][k - 1], dp[k + 1][e]);
                    globalMin = Math.min(globalMin, localMax);
                }
                dp[s][e] = s + 1 == e ? s : globalMin;
            }
        }
        return dp[1][n];
    }

}
