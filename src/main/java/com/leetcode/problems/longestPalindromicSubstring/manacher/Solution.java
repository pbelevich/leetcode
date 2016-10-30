package com.leetcode.problems.longestPalindromicSubstring.manacher;

public class Solution {

    public String longestPalindrome(String s) {
        if (s == null) {
            return null;
        }
        if (s.isEmpty()) {
            return s;
        }

        char[] chars = new char[(s.length() << 1) + 1];

        for (int i = 0; i < s.length(); i++) {
            chars[i << 1] = s.charAt(i);
        }

        int[] a = new int[chars.length];
        int expandedBy = 0;
        for (int i = 0; i < chars.length; i++) {
            int halfLength = expand(chars, i);
            a[i] = (halfLength << 1) + 1;
            expandedBy = Math.max(expandedBy, i + halfLength);
            for (int j = 1; j <= halfLength; j++) {
                a[i + j] = a[i - j];
            }
            for (int j = i + 1; j <= i + halfLength; j++) {
                if (j + a[j] - 1 >= expandedBy) {
                    i = j - 1;
                    break;
                }
            }
        }

        int max = 0;
        for (int i = 1; i < chars.length; i++) {
            if (a[i] > a[max]) {
                max = i;
            }
        }

        if (chars[max] == 0) {
            int halfLength = ((a[max] >> 1) + 1) >> 1;
            max >>= 1;
            return s.substring(max - halfLength + 1, max + halfLength + 1);
        } else {
            int halfLength = a[max] >> 2;
            max >>= 1;
            return s.substring(max - halfLength, max + halfLength + 1);
        }
    }

    private int expand(char[] s, int i) {
        int j;
        for (j = 0; (i - 1 - j) >= 0 && (i + j + 1) < s.length && s[i - 1 - j] == s[i + 1 + j]; j++);
        return j;
    }

}
