package com.leetcode.problems.longestPalindromicSubstring.dp;

public class Solution {

    public String longestPalindrome(String s) {
        if (s == null) {
            return null;
        }
        if (s.isEmpty()) {
            return s;
        }

        int maxI = 0, max = 0;
        int[][] map = new int[s.length() + 1][s.length() + 1];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(s.length() - 1 - j)) {
                    map[i][j] = map[i + 1][j + 1] + 1;
                    if (map[i][j] > max) {
                        maxI = i;
                        max = map[i][j];
                    }
                }
            }
        }
        return s.substring(maxI, maxI + max);
    }

}