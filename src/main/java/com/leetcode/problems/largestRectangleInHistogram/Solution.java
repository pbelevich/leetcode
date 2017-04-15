package com.leetcode.problems.largestRectangleInHistogram;

/**
 * https://leetcode.com/problems/largest-rectangle-in-histogram/#/description
 *
 * 84. Largest Rectangle in Histogram
 *
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.
 *
 * Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
 *
 * The largest rectangle is shown in the shaded area, which has area = 10 unit.
 *
 * For example,
 * Given heights = [2,1,5,6,2,3],
 * return 10.
 *
 * @author Pavel Belevich
 */
public class Solution {

    private int[] heights;

    public int largestRectangleArea(int[] heights) {
        this.heights = heights;
        return largestRectangleArea(0, heights.length - 1);
    }

    private int largestRectangleArea(int lo, int hi) {
        final int length = hi - lo + 1;
        if (length == 0) {
            return 0;
        }
        final int minIndex = minIndex(lo, hi);
        return Math.max(length * heights[minIndex],
                Math.max(largestRectangleArea(lo, minIndex - 1), largestRectangleArea(minIndex + 1, hi)));
    }

    private int minIndex(int lo, int hi) {
        int minIndex = lo;
        for (int i = lo + 1; i <= hi; i++) {
            if (heights[i] < heights[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

}
