package com.leetcode.problems.validNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static Solution SOLUTION = new Solution();

    @Test
    public void isNumber() throws Exception {
        assertTrue(SOLUTION.isNumber("0"));
        assertTrue(SOLUTION.isNumber(" 0.1 "));
        assertFalse(SOLUTION.isNumber("abc"));
        assertFalse(SOLUTION.isNumber("1 a"));
        assertTrue(SOLUTION.isNumber("2e10"));
        assertFalse(SOLUTION.isNumber("959440.94f"));
        assertFalse(SOLUTION.isNumber("84656e656D"));
    }

}