package com.leetcode.problems.trappingRainWater;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void trap() throws Exception {
        assertEquals(0, SOLUTION.trap(null));
        assertEquals(0, SOLUTION.trap(new int[]{}));
        assertEquals(0, SOLUTION.trap(new int[]{1}));
        assertEquals(0, SOLUTION.trap(new int[]{1, 2}));
        assertEquals(0, SOLUTION.trap(new int[]{1, 2, 1}));
        assertEquals(1, SOLUTION.trap(new int[]{2, 1, 2}));
        assertEquals(6, SOLUTION.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(9, SOLUTION.trap(new int[]{0, 1, 0, 3, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(1, SOLUTION.trap(new int[]{4, 2, 3}));
    }

}