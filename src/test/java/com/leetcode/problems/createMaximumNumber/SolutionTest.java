package com.leetcode.problems.createMaximumNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void maxNumber() throws Exception {
        assertArrayEquals(new int[]{9, 8, 6, 5, 3}, SOLUTION.maxNumber(new int[]{3, 4, 6, 5}, new int[]{9, 1, 2, 5, 8, 3}, 5));
        assertArrayEquals(new int[]{6, 7, 6, 0, 4}, SOLUTION.maxNumber(new int[]{6, 7}, new int[]{6, 0, 4}, 5));
        assertArrayEquals(new int[]{9, 8, 9}, SOLUTION.maxNumber(new int[]{3, 9}, new int[]{8, 9}, 3));
    }

}