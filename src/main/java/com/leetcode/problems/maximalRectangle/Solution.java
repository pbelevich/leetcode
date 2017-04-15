package com.leetcode.problems.maximalRectangle;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/maximal-rectangle/#/description
 *
 * 85. Maximal Rectangle
 *
 * Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
 *
 * For example, given the following matrix:
 *
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 * Return 6.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int maxArea = 0;
        int[] h = new int[matrix[0].length + 1];
        for (int r = 0; r < matrix.length; r++) {
            Deque<Integer> stack = new ArrayDeque<>();
            for (int c = 0; c <= matrix[r].length; c++) {
                if (c < matrix[r].length) {
                    if (matrix[r][c] == '1') {
                        h[c]++;
                    } else {
                        h[c] = 0;
                    }
                }

                if (stack.isEmpty() || h[stack.peek()] <= h[c]) {
                    stack.push(c);
                } else {
                    while (!stack.isEmpty() && h[stack.peek()] > h[c]) {
                        int top = stack.pop();
                        maxArea = Math.max(maxArea, h[top] * (stack.isEmpty() ? c : (c - 1 - stack.peek())));
                    }
                    stack.push(c);
                }
            }
        }
        return maxArea;
    }

}
