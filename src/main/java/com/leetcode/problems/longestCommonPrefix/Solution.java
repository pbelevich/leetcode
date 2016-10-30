package com.leetcode.problems.longestCommonPrefix;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String min = strs[0];
        for (String str : strs) {
            if (str.length() < min.length()) {
                min = str;
            }
        }

        char[] minChars = min.toCharArray();
        int length = minChars.length;
        for (String str : strs) {
            char[] chars = str.toCharArray();
            for (int i = 0; i < length; i++) {
                if (minChars[i] != chars[i]) {
                    length = i;
                }
                if (length == 0) {
                    return "";
                }
            }
        }
        return min.substring(0, length);
    }

}