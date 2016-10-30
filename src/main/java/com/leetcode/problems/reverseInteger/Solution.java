package com.leetcode.problems.reverseInteger;

public class Solution {

    public int reverse(int x) {
        long result = 0;
        int y = Math.abs(x);
        int pow = 0;

        int[] digits = new int[16];
        int i = 0;
        while (y > 0) {
            digits[i++] = y % 10;
            y /= 10;
            pow++;
        }

        long mult = 1;
        for (int j = pow - 1; j >= 0; j--) {
            result += digits[j] * mult;
            mult *= 10;
        }

        if (x < 0) {
            result = -result;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            result = 0;
        }

        return (int) result;
    }

}