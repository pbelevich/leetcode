package com.leetcode.problems.longestIncreasingSubsequence;

import java.util.Arrays;

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

    private int[] nums;
    private int[][] memo;

    public int lengthOfLIS(int[] nums) {
        this.nums = nums;
        this.memo = new int[nums.length + 1][nums.length + 1];
        for (int[] l : memo) {
            Arrays.fill(l, -1);
        }
        return lengthOfLIS(-1, 0);
    }

    private int lengthOfLIS(int prev, int start) {
        if (this.memo[prev + 1][start] == -1) {
            if (start == nums.length) {
                return 0;
            }
            int result = lengthOfLIS(prev, start + 1);
            if (nums[start] > getNum(nums, prev)) {
                result = Math.max(result, 1 + lengthOfLIS(start, start + 1));
            }
            this.memo[prev + 1][start] =  result;
        }
        return this.memo[prev + 1][start];
    }

    private int getNum(int[] nums, int prev) {
        if (prev == -1) {
            return Integer.MIN_VALUE;
        }
        return nums[prev];
    }

}
