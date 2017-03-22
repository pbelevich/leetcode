package com.leetcode.problems.uglyNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void isUgly() throws Exception {
        assertFalse(SOLUTION.isUgly(-1));
        assertFalse(SOLUTION.isUgly(0));
        assertTrue(SOLUTION.isUgly(1));
        assertTrue(SOLUTION.isUgly(2));
        assertTrue(SOLUTION.isUgly(3));
        assertTrue(SOLUTION.isUgly(4));
        assertTrue(SOLUTION.isUgly(5));
        assertTrue(SOLUTION.isUgly(6));
        assertFalse(SOLUTION.isUgly(7));
        assertTrue(SOLUTION.isUgly(8));
        assertTrue(SOLUTION.isUgly(9));
        assertTrue(SOLUTION.isUgly(10));
        assertFalse(SOLUTION.isUgly(11));
    }

}