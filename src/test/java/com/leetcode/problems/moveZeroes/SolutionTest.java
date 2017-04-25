package com.leetcode.problems.moveZeroes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void moveZeroes() throws Exception {
        final int[] actual = {0, 1, 0, 3, 12};
        SOLUTION.moveZeroes(actual);
        assertArrayEquals(new int[] {1, 3, 12, 0, 0}, actual);
    }

}