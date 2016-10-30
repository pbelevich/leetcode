package com.leetcode.problems.twoSum.array;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        int[] map = new int[max - min + 1];
        for (int i = 0; i < nums.length; i++) {
            map[nums[i] - min] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            int i1 = target - nums[i] - min;
            if (i1 >= 0 && i1 < map.length) {
                int j = map[i1];
                if (j != 0 && i < j) {
                    return new int[]{i, j};
                }
            }
        }
        throw new RuntimeException("Fucked up");
    }

}
