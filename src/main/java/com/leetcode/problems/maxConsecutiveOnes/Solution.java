package com.leetcode.problems.maxConsecutiveOnes;

/**
 * https://leetcode.com/problems/max-consecutive-ones/#/description
 * <p>
 * 485. Max Consecutive Ones
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; ) {
            if (nums[i] == 1) {
                int curr = 0;
                for (int j = i; j < nums.length && nums[j] == 1; j++) {
                    curr++;
                }
                max = Math.max(max, curr);
                i += curr;
            }
            i++;
        }
        return max;
    }

}
