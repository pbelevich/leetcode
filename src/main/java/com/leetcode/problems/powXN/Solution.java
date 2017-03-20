package com.leetcode.problems.powXN;

/**
 * https://leetcode.com/problems/powx-n/#/description
 * <p>
 * 50. Pow(x, n)
 * <p>
 * Implement pow(x, n).
 *
 * @author Pavel Belevich
 */
public class Solution {

    public double myPow(double x, int n) {
        if (x == 1.0) {
            return x;
        }
        if (n == Integer.MIN_VALUE) {
            return myPow(x, n + 1) * myPow(x, -1);
        }
        if (n < 0) {
            return 1.0 / myPow(x, -n);
        }
        double result = 1;
        double multiplier = x;
        while (n > 0) {
            if ((n & 1) == 1) {
                result *= multiplier;
            }
            multiplier *= multiplier;
            n >>= 1;
        }
        return result;
    }

}
