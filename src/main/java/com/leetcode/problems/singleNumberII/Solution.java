package com.leetcode.problems.singleNumberII;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int singleNumber(int[] nums) {
        return singleNumber(nums, 0, nums.length);
    }

    static int singleNumber(int[] nums, int lo, int hi) {
        if (hi - lo > 1) {
            int l = lo;
            int m = lo;
            for (int r = lo; r < hi - 1; r++) {
                if (nums[r] == nums[hi - 1]) {
                    swap(nums, r, m++);
                } else if (nums[r] < nums[hi - 1]) {
                    if (l == m) {
                        swap(nums, r, l);
                        l++;
                        m++;
                    } else {
                        swap(nums, r, l++);
                        swap(nums, r, m++);
                    }
                }
            }
            swap(nums, m++, hi - 1);
            if (m - l == 1) {
                return nums[l];
            } else if (((l - lo) % 3) == 1) {
                return singleNumber(nums, lo, l);
            } else {
                return singleNumber(nums, m, hi);
            }
        } else {
            return nums[lo];
        }
    }

    static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

}
