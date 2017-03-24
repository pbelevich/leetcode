package com.leetcode.problems.removeDuplicatesFromSortedArray;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/#/description
 * <p>
 * 26. Remove Duplicates from Sorted Array
 * <p>
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * For example,
 * Given input array nums = [1,1,2],
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n < 2) return n;
        int id = 1;
        for(int i = 1; i < n; ++i)
            if(nums[i] != nums[i-1]) nums[id++] = nums[i];
        return id;
    }

}
