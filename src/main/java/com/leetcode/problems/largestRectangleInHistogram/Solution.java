package com.leetcode.problems.largestRectangleInHistogram;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/largest-rectangle-in-histogram/#/description
 * <p>
 * 84. Largest Rectangle in Histogram
 * <p>
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.
 * <p>
 * Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
 * <p>
 * The largest rectangle is shown in the shaded area, which has area = 10 unit.
 * <p>
 * For example,
 * Given heights = [2,1,5,6,2,3],
 * return 10.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>(heights.length);
        int maxArea = 0;
        int i;
        for (i = 0; i < heights.length;) {
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i++);
            } else {
                while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                    int tp = stack.pop();
                    maxArea = Math.max(maxArea, heights[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1));
                }
            }
        }
        while (!stack.isEmpty()) {
            int tp = stack.pop();
            maxArea = Math.max(maxArea, heights[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1));
        }
        return maxArea;
    }

}
