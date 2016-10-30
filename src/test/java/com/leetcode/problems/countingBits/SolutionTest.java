package com.leetcode.problems.countingBits;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testCountBits() throws Exception {
        assertArrayEquals(new int[] {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2}, SOLUTION.countBits(12));
    }

}