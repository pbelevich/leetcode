package com.leetcode.problems.zigzagConversion.b;

public class Solution {

    public String convert(String s, int numRows) {
        if (s == null) {
            return null;
        }
        if (s.isEmpty() || numRows == 1) {
            return s;
        }

        char[] input = s.toCharArray();

        char[] result = new char[input.length];
        int c = 0;

        int k = (numRows << 1) - 2;

        for (int i = 0; i < input.length; i += k) {
            result[c++] = input[i];
        }

        for (int n = 1; n <= numRows - 2; n++) {
            for (int i = n; i < input.length; i += k) {
                result[c++] = input[i];
                int j = i + k - (n << 1);
                if (j < input.length) result[c++] = input[j];
            }
        }

        for (int i = numRows - 1; i < input.length; i += k) {
            result[c++] = input[i];
        }

        return new String(result);
    }

}