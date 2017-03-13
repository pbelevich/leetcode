package com.leetcode.problems.arithmeticSlices;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void numberOfArithmeticSlices() throws Exception {
        assertEquals(1, SOLUTION.numberOfArithmeticSlices(new int[]{1, 2, 3}));
        assertEquals(6, SOLUTION.numberOfArithmeticSlices(new int[]{1, 3, 5, 7, 9}));
        assertEquals(3, SOLUTION.numberOfArithmeticSlices(new int[]{1, 1, 1, 1}));
        assertEquals(16, SOLUTION.numberOfArithmeticSlices(new int[]{-9, -8, -7, -6, -5, 1, 2, 3, 4, 5, 5, 5, 10, 10, 10, 10}));
        assertEquals(0, SOLUTION.numberOfArithmeticSlices(new int[]{2, 1, 3, 4, 2, 3}));
    }

}