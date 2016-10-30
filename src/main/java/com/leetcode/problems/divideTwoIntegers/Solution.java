package com.leetcode.problems.divideTwoIntegers;

public class Solution {

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
        boolean negative = dividend < 0 ^ divisor < 0;
        long dividendLong = abs(dividend);
        long divisorLong = abs(divisor);

        long[] divisors = new long[32];
        divisors[0] = divisorLong;
        for (int i = 1; i < divisors.length; i++) {
            long j = divisors[i - 1] + divisors[i - 1];
            divisors[i] = j;
        }

        int max = divisors.length - 1;
        long result = 0;
        while (true) {
            for (; max >= 0 && divisors[max] > dividendLong; max--);
            if (max < 0) {
                break;
            }
            dividendLong -= divisors[max];
            result |= 1L << max;
        }
        return toInt(negative, result);
    }

    private int toInt(boolean negative, long result) {
        long res = negative ? -result : result;
        if (Integer.MIN_VALUE > res || res > Integer.MAX_VALUE) {
            res = Integer.MAX_VALUE;
        }
        return (int) res;
    }

    private static long abs(long x) {
        return x < 0 ? -x : x;
    }

}