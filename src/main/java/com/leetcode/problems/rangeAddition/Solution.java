package com.leetcode.problems.rangeAddition;

/**
 * https://leetcode.com/problems/range-addition/#/description
 * <p>
 * 370. Range Addition
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int[] getModifiedArray(int length, int[][] updates) {
        int[] result = new int[length];
        for (int[] up : updates) {
            int start = up[0];
            int end = up[1];
            int delta = up[2];
            result[start] += delta;
            if (end + 1 < length) {
                result[end + 1] -= delta;
            }
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += result[i];
            result[i] = sum;
        }
        return result;
    }

}
