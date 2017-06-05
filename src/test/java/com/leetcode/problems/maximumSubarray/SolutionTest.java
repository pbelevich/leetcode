package com.leetcode.problems.maximumSubarray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void maxSubArray() throws Exception {
        assertEquals(6, SOLUTION.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, SOLUTION.maxSubArray(new int[]{-2, 1}));
    }

}