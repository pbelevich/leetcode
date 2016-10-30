package com.leetcode.problems.containerWithMostWater;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void maxArea() throws Exception {
        assertEquals(1, SOLUTION.maxArea(new int[] {1, 1}));
        assertEquals(2, SOLUTION.maxArea(new int[] {1, 2, 1}));
        assertEquals(4, SOLUTION.maxArea(new int[] {1,2,4,3}));
    }

}