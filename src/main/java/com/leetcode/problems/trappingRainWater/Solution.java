package com.leetcode.problems.trappingRainWater;

import static java.lang.Math.max;

/**
 * https://leetcode.com/problems/trapping-rain-water/#/description
 *
 * 42. Trapping Rain Water
 *
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 *
 * For example,
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        int result = 0;
        int left;
        int maxSoFar = height[0];
        for (left = 0; height[left] != max; left++) {
            if (height[left] < maxSoFar) {
                result += maxSoFar - height[left];
            }
            maxSoFar = max(maxSoFar, height[left]);
        }
        int right;
        maxSoFar = height[height.length - 1];
        for (right = height.length - 1; height[right] != max; right--) {
            if (height[right] < maxSoFar) {
                result += maxSoFar - height[right];
            }
            maxSoFar = max(maxSoFar, height[right]);
        }
        for (int i = left + 1; i < right; i++) {
            result += max - height[i];
        }
        return result;
    }

}
