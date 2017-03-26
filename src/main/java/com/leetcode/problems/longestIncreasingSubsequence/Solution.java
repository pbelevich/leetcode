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
        if (nums.length < 2) {
            return nums.length;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + 1;
            result = Math.max(result, dp[i]);
        }
        return result;
    }

}
