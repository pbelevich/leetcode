package com.leetcode.problems.createMaximumNumber;

/**
 * https://leetcode.com/problems/create-maximum-number/#/description
 * <p>
 * 321. Create Maximum Number
 * <p>
 * Given two arrays of length m and n with digits 0-9 representing two numbers.
 * Create the maximum number of length k <= m + n from digits of the two.
 * The relative order of the digits from the same array must be preserved.
 * Return an array of the k digits. You should try to optimize your time and space complexity.
 * <p>
 * Example 1:
 * nums1 = [3, 4, 6, 5]
 * nums2 = [9, 1, 2, 5, 8, 3]
 * k = 5
 * return [9, 8, 6, 5, 3]
 * <p>
 * Example 2:
 * nums1 = [6, 7]
 * nums2 = [6, 0, 4]
 * k = 5
 * return [6, 7, 6, 0, 4]
 * <p>
 * Example 3:
 * nums1 = [3, 9]
 * nums2 = [8, 9]
 * k = 3
 * return [9, 8, 9]
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        return maxNumber(nums1, 0, nums2, 0, k);
    }

    int[] maxNumber(int[] nums1, int i1, int[] nums2, int i2, int k) {
        int[] max = new int[k];
        if (k > 0) {
            for (int i = i1; i < nums1.length && (nums1.length - i + nums2.length - i2 >= k); i++) {
                max = max(max, plus(nums1[i], maxNumber(nums1, i + 1, nums2, i2, k - 1)), 0);
            }
            for (int i = i2; i < nums2.length && (nums1.length - i1 + nums2.length - i >= k); i++) {
                max = max(max, plus(nums2[i], maxNumber(nums1, i1, nums2, i + 1, k - 1)), 0);
            }
        }
        return max;
    }

    int[] plus(int first, int[] array) {
        final int[] result = new int[array.length + 1];
        result[0] = first;
        System.arraycopy(array, 0, result, 1, array.length);
        return result;
    }

    int[] max(int[] a1, int[] a2, int i) {
        if (i >= a1.length) {
            return a1;
        } else if (a1[i] > a2[i]) {
            return a1;
        } else if (a2[i] > a1[i]) {
            return a2;
        } else {
            return max(a1, a2, i + 1);
        }
    }

}
