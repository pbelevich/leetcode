package com.leetcode.problems.bitwiseANDOfNumbersRange;

/**
 * https://leetcode.com/problems/bitwise-and-of-numbers-range/#/description
 * <p>
 * 201. Bitwise AND of Numbers Range
 * <p>
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
 * <p>
 * For example, given the range [5, 7], you should return 4.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int rangeBitwiseAnd(int m, int n) {
        int range = n - m;
        int mask = -1;
        while (range > 0) {
            range >>= 1;
            mask <<= 1;
        }
        return m & n & mask;
    }

}
