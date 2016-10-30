package com.leetcode.problems.containerWithMostWater;

public class Solution {

    public int maxArea(int[] height) {
        int maxVolume = 0;
        for (int l = 0, r = height.length - 1; l < r; ) {
            int heightL = height[l];
            int heightR = height[r];
            int candidate = Math.min(heightL, heightR) * (r - l);
            if (candidate > maxVolume) {
                maxVolume = candidate;
            }
            if (height[l] < height[r]) {
                while (l < height.length && height[l] <= heightL) l++;
            } else if (height[l] > height[r]) {
                while (r >= 0 && height[r] <= heightR) r--;
            } else {
                while (l < height.length && height[l] <= heightL) l++;
                while (r >= 0 && height[r] <= heightR) r--;
            }
        }
        return maxVolume;
    }

}