package com.leetcode.problems.countingBits;

public class Solution {

    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        result[0] = 0;
        for (int window = 1; window < result.length; window <<= 1) {
            int length = Math.min(window, result.length - window);
            System.arraycopy(result, 0, result, window, length);
            for (int i = 0; i < length; i++) {
                result[window + i]++;
            }
        }
        return result;
    }

}