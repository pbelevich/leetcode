package com.leetcode.problems.longestLineOfConsecutiveOneInMatrix;

/**
 * 562. Longest Line of Consecutive One in Matrix
 *
 * @author Pavel Belevich
 */
public class Solution {

    private final static int[][] directions = new int[][]{{1, 0}, {0, 1}, {1, 1}, {1, -1}};

    public int longestLine(int[][] M) {
        int result = 0;
        if (M != null && M.length > 0 && M[0].length > 0) {
            int[][][] dp = new int[M.length + 1][M[0].length + 1][4];
            for (int i = M.length - 1; i >= 0; i--) {
                for (int j = M[0].length - 1; j >= 0; j--) {
                    if (M[i][j] == 1) {
                        for (int k = 0; k < 4; k++) {
                            dp[i][j][k] = 1;
                            if (j + directions[k][1] >= 0) {
                                dp[i][j][k] += dp[i + directions[k][0]][j + directions[k][1]][k];
                            }
                            result = Math.max(result, dp[i][j][k]);
                        }
                    }
                }
            }
        }
        return result;
    }

}
