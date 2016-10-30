package com.leetcode.problems.stringToIntegerAtoi;

import org.junit.Test;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testMyAtoi() throws Exception {
        assertEquals(0, SOLUTION.myAtoi(null));
        assertEquals(0, SOLUTION.myAtoi(""));
        assertEquals(0, SOLUTION.myAtoi("0"));
        assertEquals(1, SOLUTION.myAtoi("1"));
        assertEquals(-1, SOLUTION.myAtoi("-1"));
        assertEquals(123456789, SOLUTION.myAtoi("123456789"));
        assertEquals(-123456789, SOLUTION.myAtoi("-123456789"));
        assertEquals(0, SOLUTION.myAtoi("+-2"));
        assertEquals(10, SOLUTION.myAtoi("    010"));
        assertEquals(-12, SOLUTION.myAtoi("  -0012a42"));
        assertEquals(0, SOLUTION.myAtoi("   +0 123"));
        assertEquals(MAX_VALUE, SOLUTION.myAtoi("2147483648"));
        assertEquals(MIN_VALUE, SOLUTION.myAtoi("-2147483649"));
        assertEquals(23, SOLUTION.myAtoi("23a8f"));
        assertEquals(123, SOLUTION.myAtoi("123  456"));
        assertEquals(0, SOLUTION.myAtoi("   - 321"));
        assertEquals(MAX_VALUE, SOLUTION.myAtoi("    10522545459"));
    }

}