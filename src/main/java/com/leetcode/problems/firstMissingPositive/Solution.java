package com.leetcode.problems.firstMissingPositive;

/**
 * https://leetcode.com/problems/first-missing-positive
 * <p>
 * 41. First Missing Positive
 * <p>
 * Given an unsorted integer array, find the first missing positive integer.
 * <p>
 * For example,
 * Given [1,2,0] return 3,
 * and [3,4,-1,1] return 2.
 * <p>
 * Your algorithm should run in O(n) time and uses constant space.
 * <p>
 * <p>
 * <p>
 * Put each number in its right place.
 * <p>
 * For example:
 * <p>
 * When we find 5, then swap it with A[4].
 * <p>
 * At last, the first place where its number is not right, return the place + 1.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int firstMissingPositive(int[] nums) {
        boolean one = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) one = false;
        }
        if (one) {
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == nums[i]) continue;
            while (nums[i] <= nums.length && nums[i] >= 1 && nums[i] != nums[nums[i] - 1]) {
                int j = nums[i] - 1;
                int t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums[i]) return i + 1;
        }
        return nums.length + 1;
    }

}