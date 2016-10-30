package com.leetcode.problems.reverseInteger;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testReverse() throws Exception {
        assertEquals(0, SOLUTION.reverse(0));
        assertEquals(321, SOLUTION.reverse(123));
        assertEquals(-321, SOLUTION.reverse(-123));
        assertEquals(54435425, SOLUTION.reverse(52453445));
        assertEquals(0, SOLUTION.reverse(1534236469));
        assertEquals(0, SOLUTION.reverse(-1563847412));
    }

}