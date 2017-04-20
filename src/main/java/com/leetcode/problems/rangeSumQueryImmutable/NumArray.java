package com.leetcode.problems.rangeSumQueryImmutable;

/**
 * https://leetcode.com/problems/range-sum-query-immutable/#/description
 * <p>
 * 303. Range Sum Query - Immutable
 * <p>
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 * <p>
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * <p>
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * Note:
 * You may assume that the array does not change.
 * There are many calls to sumRange function.
 *
 * @author Pavel Belevich
 */
public class NumArray {

    private int[] sum;

    public NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        int sumSoFar = 0;
        for (int i = 1; i < sum.length; i++) {
            sumSoFar += nums[i - 1];
            sum[i] = sumSoFar;
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }

}
