package com.leetcode.problems.studentAttendanceRecordII;

/**
 * 552. Student Attendance Record II
 *
 * @author Pavel Belevich
 */
public class Solution {

    private static final int MOD = 1000000007;
    private int[][][] dp;

    public int checkRecord(int N) {
        if (N == 0) {
            return 0;
        }
        dp = new int[2][3][N + 1];
        for (int n = 0; n <= N; n++) {
            for (int l = 0; l <= 2; l++) {
                for (int a = 0; a <= 1; a++) {
                    dp[a][l][n] = checkRecord(n, a, l);
                }
            }
        }
        return dp[0][0][N];
    }

    private int checkRecord(int n, int a, int l) {
        int result;
        if (n == 0) {
            result = 1;
        } else {
            if (a == 0) {
                if (l < 2) {
                    result = (dp[a][0][n - 1] + // P
                            dp[a][l + 1][n - 1]) % MOD + // L
                            dp[a + 1][0][n - 1]; // A
                } else {
                    result = dp[a][0][n - 1] + // P
                            dp[a + 1][0][n - 1]; // A
                }
            } else {
                if (l < 2) {
                    result = dp[a][0][n - 1] + // P
                            dp[a][l + 1][n - 1]; // L
                } else {
                    result = dp[a][0][n - 1]; // P
                }
            }
        }
        return result % MOD;
    }

}
