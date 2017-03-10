package com.leetcode.problems.wildcardMatching;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void isMatch() throws Exception {
        assertTrue(SOLUTION.isMatch("", ""));
        assertTrue(SOLUTION.isMatch("", "*"));
        assertTrue(SOLUTION.isMatch("a", "a"));
        assertFalse(SOLUTION.isMatch("a", "b"));
        assertTrue(SOLUTION.isMatch("a", "?"));
        assertTrue(SOLUTION.isMatch("a", "*"));
        assertTrue(SOLUTION.isMatch("ab", "*"));
        assertTrue(SOLUTION.isMatch("ab", "a*"));
        assertFalse(SOLUTION.isMatch("ab", "b*"));
        assertTrue(SOLUTION.isMatch("abc", "*"));
        assertTrue(SOLUTION.isMatch("abc", "***"));
        assertTrue(SOLUTION.isMatch("abc", "???"));
        assertTrue(SOLUTION.isMatch("abc", "?*?"));
        assertTrue(SOLUTION.isMatch("abc", "*?*"));
        assertTrue(SOLUTION.isMatch("abc", "*?"));
        assertTrue(SOLUTION.isMatch("abc", "?*"));
        assertTrue(SOLUTION.isMatch("abc", "ab?"));
        assertTrue(SOLUTION.isMatch("abc", "a?c"));
        assertTrue(SOLUTION.isMatch("abc", "?bc"));
        assertTrue(SOLUTION.isMatch("abc", "a**"));
        assertTrue(SOLUTION.isMatch("abc", "*b*"));
        assertTrue(SOLUTION.isMatch("abc", "**c"));
        assertFalse(SOLUTION.isMatch("abc", "abcd"));
        assertFalse(SOLUTION.isMatch("abc", "a?cd"));
        assertFalse(SOLUTION.isMatch("abc", "a?cd*"));
    }

}