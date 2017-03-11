package com.leetcode.problems.searchForARange;

/**
 * https://leetcode.com/problems/search-for-a-range/
 * <p>
 * 34. Search for a Range
 * <p>
 * Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
 * <p>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * <p>
 * If the target is not found in the array, return [-1, -1].
 * <p>
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 *
 * @author Pavel Belevich
 */
public class Solution {

    public static final int[] NOT_FOUND = {-1, -1};

    public int[] searchRange(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length;
        int found;
        while (true) {
            final int len = hi - lo;
            if (len == 0) {
                return NOT_FOUND;
            } else if (len == 1) {
                if (nums[lo] == target) {
                    found = lo;
                    break;
                } else {
                    return NOT_FOUND;
                }
            } else {
                final int mid = (lo + hi) >>> 1;
                if (target < nums[mid]) {
                    hi = mid;
                } else if (target > nums[mid]) {
                    lo = mid + 1;
                } else {
                    found = mid;
                    break;
                }
            }
        }

        lo = 0;
        hi = found;
        int left;
        while (hi != lo) {
            final int mid = (lo + hi) >>> 1;
            if (nums[mid] == target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        left = lo;

        lo = found;
        hi = nums.length - 1;
        int right;
        while (hi != lo) {
            final int mid = ((lo + hi + 1) >>> 1);
            if (nums[mid] == target) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        right = lo;

        return new int[]{left, right};
    }

}
