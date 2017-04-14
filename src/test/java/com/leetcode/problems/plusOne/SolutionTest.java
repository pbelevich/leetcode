package com.leetcode.problems.plusOne;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void plusOne() throws Exception {
        assertArrayEquals(new int[]{1}, SOLUTION.plusOne(new int[]{0}));
        assertArrayEquals(new int[]{1, 2, 4}, SOLUTION.plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{9, 9, 9}, SOLUTION.plusOne(new int[]{9, 9, 8}));
        assertArrayEquals(new int[]{1, 0, 0, 0}, SOLUTION.plusOne(new int[]{9, 9, 9}));
    }

}