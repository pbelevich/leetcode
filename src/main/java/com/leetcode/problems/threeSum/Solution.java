package com.leetcode.problems.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return Collections.emptyList();
        }

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

        List<List<Integer>> result = new ArrayList<>();

        boolean zeros = false;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];
                if (b >= a) {
                    int c = -a - b;
                    if (c >= min && c <= max && map[c - min] != 0) {
                        if (c >= b) {
                            if (a == 0 && b == 0 && c == 0) {
                                zeros = true;
                            } else {
                                result.add(Arrays.asList(a, b, c));
                            }
                        }
                    }
                }
            }
        }
        if (zeros) {
            result.add(Arrays.asList(0, 0, 0));
        }

        return result;
    }

}