package com.leetcode.problems.searchInRotatedSortedArray;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 * <p>
 * 33. Search in Rotated Sorted Array
 * <p>
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * <p>
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * <p>
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * <p>
 * You may assume no duplicate exists in the array.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int search(int[] nums, int target) {
        int end = 0;
        int begin = nums.length;
        while (begin - end > 1) {
            final int mid = (begin + end) >>> 1;
            if (nums[mid] < nums[end]) {
                begin = mid;
            } else {
                end = mid;
            }
        }
        int lo = 0;
        int hi = nums.length;
        while (true) {
            final int len = hi - lo;
            int loBegin = index(nums, begin, lo);
            if (len == 0) {
                return -1;
            } else if (len == 1 && nums[loBegin] == target) {
                return loBegin;
            } else {
                final int mid = (lo + hi) >>> 1;
                int midBegin = index(nums, begin, mid);
                if (target < nums[midBegin]) {
                    hi = mid;
                } else if (target > nums[midBegin]) {
                    lo = mid + 1;
                } else {
                    return midBegin;
                }
            }
        }
    }

    private int index(int[] nums, int begin, int lo) {
        int result = lo + begin;
        if (result >= nums.length) result -= nums.length;
        return result;
    }

}