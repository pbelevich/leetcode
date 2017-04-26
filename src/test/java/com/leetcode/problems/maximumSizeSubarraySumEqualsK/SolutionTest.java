package com.leetcode.problems.maximumSizeSubarraySumEqualsK;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void maxSubArrayLen1() throws Exception {
        assertEquals(4, SOLUTION.maxSubArrayLen(new int[] {1, -1, 5, -2, 3}, 3));
    }

    @Test
    public void maxSubArrayLen2() throws Exception {
        assertEquals(2, SOLUTION.maxSubArrayLen(new int[] {-2, -1, 2, 1}, 1));
    }

}