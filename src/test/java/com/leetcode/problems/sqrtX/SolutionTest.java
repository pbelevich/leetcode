package com.leetcode.problems.sqrtX;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void mySqrt() throws Exception {
        assertEquals(0, SOLUTION.mySqrt(0));
        assertEquals(1, SOLUTION.mySqrt(1));
        assertEquals(1, SOLUTION.mySqrt(2));
        assertEquals(1, SOLUTION.mySqrt(3));
        assertEquals(2, SOLUTION.mySqrt(4));
        assertEquals(2, SOLUTION.mySqrt(5));
        assertEquals(2, SOLUTION.mySqrt(6));
        assertEquals(2, SOLUTION.mySqrt(7));
        assertEquals(2, SOLUTION.mySqrt(8));
        assertEquals(3, SOLUTION.mySqrt(9));
        assertEquals(3, SOLUTION.mySqrt(10));
        assertEquals(3, SOLUTION.mySqrt(11));
        assertEquals(3, SOLUTION.mySqrt(12));
        assertEquals(3, SOLUTION.mySqrt(13));
        assertEquals(3, SOLUTION.mySqrt(14));
        assertEquals(3, SOLUTION.mySqrt(15));
        assertEquals(4, SOLUTION.mySqrt(16));
        assertEquals(4, SOLUTION.mySqrt(17));
    }

    @Test
    public void mySqrtMaxValue() throws Exception {
        assertEquals(46340, SOLUTION.mySqrt(Integer.MAX_VALUE));
    }

}