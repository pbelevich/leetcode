package com.leetcode.problems.missingNumber;

/**
 * https://leetcode.com/problems/missing-number/#/description
 *
 * 268. Missing Number
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int missingNumber(int[] nums) {
        long sum = 0;
        for (int n : nums) {
            sum += n;
        }
        final long length = nums.length;
        return (int) ((((length + 1) * length) >> 1) - sum);
    }

}
