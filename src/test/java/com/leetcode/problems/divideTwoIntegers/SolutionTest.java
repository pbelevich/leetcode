package com.leetcode.problems.divideTwoIntegers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void divide() throws Exception {
        assertEquals(Integer.MAX_VALUE, SOLUTION.divide(10, 0));
        assertEquals(10, SOLUTION.divide(10, 1));
        assertEquals(5, SOLUTION.divide(10, 2));
        assertEquals(3, SOLUTION.divide(10, 3));
        assertEquals(2, SOLUTION.divide(10, 4));
        assertEquals(2, SOLUTION.divide(10, 5));
        assertEquals(1, SOLUTION.divide(10, 6));
        assertEquals(1, SOLUTION.divide(10, 7));
        assertEquals(1, SOLUTION.divide(10, 8));
        assertEquals(1, SOLUTION.divide(10, 9));
        assertEquals(1, SOLUTION.divide(10, 10));
        assertEquals(0, SOLUTION.divide(10, 11));

        assertEquals(Integer.MAX_VALUE, SOLUTION.divide(-10, 0));
        assertEquals(-10, SOLUTION.divide(-10, 1));
        assertEquals(-5, SOLUTION.divide(10, -2));
        assertEquals(-3, SOLUTION.divide(-10, 3));
        assertEquals(-2, SOLUTION.divide(10, -4));
        assertEquals(-2, SOLUTION.divide(-10, 5));
        assertEquals(-1, SOLUTION.divide(10, -6));
        assertEquals(-1, SOLUTION.divide(-10, 7));
        assertEquals(-1, SOLUTION.divide(10, -8));
        assertEquals(-1, SOLUTION.divide(-10, 9));
        assertEquals(-1, SOLUTION.divide(10, -10));
        assertEquals(0, SOLUTION.divide(-10, 11));

        assertEquals(2147483647, SOLUTION.divide(-2147483648, -1));

        assertEquals(1763668, SOLUTION.divide(12345678, 7));

        assertEquals(-2147483648, SOLUTION.divide(-2147483648, 1));
    }

}