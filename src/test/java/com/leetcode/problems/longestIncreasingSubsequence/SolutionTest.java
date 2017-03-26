package com.leetcode.problems.longestIncreasingSubsequence;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void lengthOfLIS() throws Exception {
        assertEquals(0, SOLUTION.lengthOfLIS(new int[] {}));
        assertEquals(1, SOLUTION.lengthOfLIS(new int[] {1}));
        assertEquals(4, SOLUTION.lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18}));
    }

}