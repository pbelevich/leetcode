package com.leetcode.problems.reverseString;

public class Solution {

    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length >> 1; i++) {
            char t = chars[i];
            chars[i] = chars[s.length() - 1 - i];
            chars[s.length() - 1 - i] = t;
        }
        return new String(chars);
    }

}