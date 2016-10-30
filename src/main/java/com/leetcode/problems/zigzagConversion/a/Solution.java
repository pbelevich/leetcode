package com.leetcode.problems.zigzagConversion.a;

public class Solution {

    public String convert(String s, int numRows) {
        if (s == null) {
            return null;
        }
        if (s.isEmpty() || numRows == 1) {
            return s;
        }
        char[][] map = new char[numRows][s.length() / (numRows - 1) + 1];
        int c = 0;
        for (int i = 0; c < s.length(); i++) {
            for (int j = 0; j < numRows && c < s.length(); j++) {
                map[j][i << 1] = s.charAt(c++);
            }
            for (int k = 0; k < numRows - 2 && c < s.length(); k++) {
                map[numRows - k - 2][(i << 1) + 1] = s.charAt(c++);
            }
        }
        char[] result = new char[s.length()];
        c = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != 0) {
                    result[c++] = map[i][j];
                }
            }
        }
        return new String(result);
    }

}