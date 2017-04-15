package com.leetcode.problems.largestRectangleInHistogram;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void largestRectangleArea() throws Exception {
        assertEquals(10, SOLUTION.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
        assertEquals(12, SOLUTION.largestRectangleArea(new int[]{6, 1, 5, 4, 5, 2, 6}));
    }

}