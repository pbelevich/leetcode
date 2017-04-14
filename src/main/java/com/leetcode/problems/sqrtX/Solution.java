package com.leetcode.problems.sqrtX;

/**
 * https://leetcode.com/problems/sqrtx/#/description
 * <p>
 * Implement int sqrt(int x).
 * <p>
 * Compute and return the square root of x.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        } else if (x < 4) {
            return 1;
        } else {
            int lo = 2;
            int hi = x >> 1;
            while (hi - lo > 1) {
                long mid = (lo + hi) >>> 1;
                final long sqr = mid * mid;
                if (sqr > x) {
                    hi = (int) mid;
                } else if (sqr < x) {
                    lo = (int) mid;
                } else {
                    return (int) mid;
                }
            }
            return lo;
        }
    }

}
