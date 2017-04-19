package com.leetcode.problems.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/#/description
 * <p>
 * 15. 3Sum
 * <p>
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note: The solution set must not contain duplicate triplets.
 * <p>
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

//        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        int[] map = new int[max - min + 1];
        int distinct = 0;
        for (int n : nums) {
            if (map[n - min]-- == 0) {
                distinct++;
            }
        }

        int[] idx = new int[max - min + 1];
        int[] nums2 = new int[distinct];
        int p = 0;
        for (int n : nums) {
            if (map[n - min] < 0) {
                nums2[p] = n;
                idx[n - min] = p;
                p++;
                map[n - min] = -map[n - min];
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            int a = nums2[i];
            map[a - min]--;
            for (int j = i + (map[a - min] == 0 ? 1 : 0); j < nums2.length; j++) {
                int b = nums2[j];
                map[b - min]--;

                int c = 0 - a - b;
                if (0 <= c - min && c - min < map.length && map[c - min] != 0) {
                    int k = idx[c - min];
                    if (k >= j) {
                        result.add(Arrays.asList(a, b, c));
                    }
                }

                map[b - min]++;
            }
            map[a - min]++;
        }

        return result;
    }

}