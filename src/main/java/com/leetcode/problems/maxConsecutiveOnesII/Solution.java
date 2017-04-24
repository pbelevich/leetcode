package com.leetcode.problems.maxConsecutiveOnesII;

/**
 * https://leetcode.com/problems/max-consecutive-ones-ii/#/description
 * <p>
 * 487. Max Consecutive Ones II
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int prev = 0;
        int curr = 0;
        int size;
        boolean hasZeros = false;
        for (int num : nums) {
            if (num == 0) {
                hasZeros = true;
            }
        }
        if (!hasZeros) {
            return nums.length;
        }
        for (int i = 0; i < nums.length; i += size) {
            if (nums[i] == 1) {
                size = size(nums, i, 1);
                curr = size;
                max = Math.max(max, prev + 1 + curr);
            } else {
                size = size(nums, i, 0);
                if (size == 1) {
                    prev = curr;
                    curr = 0;
                } else {
                    prev = 0;
                }
            }
        }
        max = Math.max(max, prev + 1 + curr);
        return max;
    }

    int size(int[] nums, int i, int v) {
        int size = 0;
        for (int j = i; j < nums.length && nums[j] == v; j++) {
            size++;
        }
        return size;
    }

}
