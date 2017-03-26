package com.leetcode.problems.longestIncreasingSubsequence;

/**
 * https://leetcode.com/problems/longest-increasing-subsequence/#/description
 * <p>
 * 300. Longest Increasing Subsequence
 * <p>
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
 * <p>
 * For example,
 * Given [10, 9, 2, 5, 3, 7, 101, 18],
 * The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.
 * <p>
 * Your algorithm should run in O(n2) complexity.
 * <p>
 * Follow up: Could you improve it to O(n log n) time complexity?
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int lengthOfLIS(int[] nums) {
        return lengthOfLIS(nums, Integer.MIN_VALUE, 0);
    }

    private int lengthOfLIS(int[] nums, int prev, int start) {
        if (start == nums.length) {
            return 0;
        }
        int result = lengthOfLIS(nums, prev, start + 1);
        if (nums[start] > prev) {
            result = Math.max(result, 1 + lengthOfLIS(nums, nums[start], start + 1));
        }
        return result;
    }

}
