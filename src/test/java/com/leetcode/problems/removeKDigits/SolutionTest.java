package com.leetcode.problems.removeKDigits;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void removeKdigits() throws Exception {
        assertEquals("0", SOLUTION.removeKdigits("1", 1));
        assertEquals("1", SOLUTION.removeKdigits("12", 1));
        assertEquals("1", SOLUTION.removeKdigits("21", 1));
        assertEquals("1219", SOLUTION.removeKdigits("1432219", 3));
        assertEquals("200", SOLUTION.removeKdigits("10200", 1));
        assertEquals("11", SOLUTION.removeKdigits("112", 1));
        assertEquals("1111", SOLUTION.removeKdigits("1111111", 3));
        assertEquals("0", SOLUTION.removeKdigits("10", 2));
        assertEquals("0", SOLUTION.removeKdigits("1234567890", 9));
        assertEquals("33", SOLUTION.removeKdigits("5337", 2));
    }

}