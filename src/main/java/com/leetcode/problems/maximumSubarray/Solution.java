package com.leetcode.problems.maximumSubarray;

/**
 * https://leetcode.com/problems/maximum-subarray/#/description
 * <p>
 * 53. Maximum Subarray
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        int maxCurr = nums[0];
        int maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxCurr = Math.max(nums[i], maxCurr + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxCurr);
        }
        return maxSoFar;
    }

}
