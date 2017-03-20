package com.leetcode.problems.selfCrossing;

/**
 * https://leetcode.com/problems/self-crossing/#/description
 * <p>
 * 335. Self Crossing
 * <p>
 * You are given an array x of n positive numbers. You start at point (0,0) and moves x[0] metres to the north, then x[1] metres to the west, x[2] metres to the south, x[3] metres to the east and so on. In other words, after each move your direction changes counter-clockwise.
 * <p>
 * Write a one-pass algorithm with O(1) extra space to determine, if your path crosses itself, or not.
 * <p>
 * Example 1:
 * Given x =
 * [2, 1, 1, 2]
 *    1
 *  ┌───┐
 * 2│   │0
 *  └───┼──>
 *    3 │
 * <p>
 * Return true (self crossing)
 * Example 2:
 * Given x =
 * [1, 2, 3, 4]
 * ,
 * ┌──────┐
 * │      │
 * │
 * │
 * └────────────>
 * <p>
 * Return false (not self crossing)
 * Example 3:
 * Given x =
 * [1, 1, 1, 1]
 * ,
 * ┌───┐
 * │   │
 * └───┼>
 * <p>
 * Return true (self crossing)
 *
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isSelfCrossing(int[] x) {
        if (x.length <= 3) {
            return false;
        }
        for (int i = 3; i < x.length; i++) {
            // Fourth line crosses first line and onward
            // if (x[3] >= x[1] && x[2] <= x[0]) return true;
            if (x[i] >= x[i - 2] && x[i - 1] <= x[i - 3]) return true;
            if (i >= 4) {
                // Fifth line meets first line and onward
                // if (x[3] == x[1] && x[4] + x[0] >= x[2]) return true;
                if (x[i - 1] == x[i - 3] && x[i] + x[i - 4] >= x[i - 2]) return true;
            }
            if (i >= 5) {
                // Sixth line crosses first line and onward
                // if (x[3] - x[1] >= 0 && x[5] >= x[3] - x[1] && x[4] >= x[2] - x[0] && x[4] <= x[2])
                if (x[i - 2] - x[i - 4] >= 0 && x[i] >= x[i - 2] - x[i - 4] && x[i - 1] >= x[i - 3] - x[i - 5] && x[i - 1] <= x[i - 3])
                    return true;
            }
        }
        return false;
    }

}
