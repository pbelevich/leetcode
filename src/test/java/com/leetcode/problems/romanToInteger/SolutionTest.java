package com.leetcode.problems.romanToInteger;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testRomanToInt() throws Exception {
        assertEquals(1, SOLUTION.romanToInt("I"));
        assertEquals(123, SOLUTION.romanToInt("CXXIII"));
        assertEquals(1392, SOLUTION.romanToInt("MCCCXCII"));
        assertEquals(3999, SOLUTION.romanToInt("MMMCMXCIX"));
    }

}