package com.leetcode.problems.findAllDuplicatesInAnArray;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 *
 * 442. Find All Duplicates in an Array
 *
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 *
 * Find all the elements that appear twice in this array.
 *
 * Could you do it without extra space and in O(n) runtime?
 *
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 *
 * Output:
 * [2,3]
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<Integer> findDuplicates(int[] nums) {
        boolean[] dups = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1)
            {
                if (nums[i] == nums[nums[i] - 1]) {
                    dups[nums[i]] = true;
                    break;
                }
                swap(nums, i, nums[i] - 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < dups.length; i++) {
            if (dups[i]) {
                result.add(i);
            }
        }
        return result;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[j];
        nums[j] = nums[i];
        nums[i] = t;
    }

}