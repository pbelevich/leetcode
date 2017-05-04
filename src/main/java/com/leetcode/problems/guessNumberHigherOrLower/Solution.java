package com.leetcode.problems.guessNumberHigherOrLower;

/**
 * https://leetcode.com/problems/guess-number-higher-or-lower/#/description
 * <p>
 * 374. Guess Number Higher or Lower
 *
 * @author Pavel Belevich
 */
public class Solution extends GuessGame {

    public int guessNumber(int n) {
        int lo = 1;
        int hi = n;
        while (true) {
            int mid = (lo + hi) >>> 1;
            int res = guess(mid);
            if (res > 0) {
                lo = mid + 1;
            } else if (res < 0) {
                hi = mid;
            } else {
                return mid;
            }
        }
    }

}
