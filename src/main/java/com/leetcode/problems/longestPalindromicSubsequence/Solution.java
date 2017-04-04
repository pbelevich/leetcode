package com.leetcode.problems.longestPalindromicSubsequence;

/**
 * https://leetcode.com/problems/longest-palindromic-subsequence/#/description
 * <p>
 * 516. Longest Palindromic Subsequence
 * <p>
 * Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.
 * <p>
 * Example 1:
 * Input:
 * <p>
 * "bbbab"
 * Output:
 * 4
 * One possible longest palindromic subsequence is "bbbb".
 * Example 2:
 * Input:
 * <p>
 * "cbbd"
 * Output:
 * 2
 * One possible longest palindromic subsequence is "bb".
 *
 * @author Pavel Belevich
 */
public class Solution {

    private char[] chars;
    private int[][] dp;

    public int longestPalindromeSubseq(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        chars = s.toCharArray();
        final int n = chars.length;
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for (int length = 1; length < n; length++) {
            for (int i = 0; i + length < n; i++) {
                int j = i + length;
                if (chars[i] == chars[j]) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }

}
