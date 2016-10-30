package com.leetcode.problems.regularExpressionMatching;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testIsMatch() throws Exception {
        assertTrue(SOLUTION.isMatch("cccab", "c*ab"));
        assertFalse(SOLUTION.isMatch("cccab", "c*b"));
        assertFalse(SOLUTION.isMatch("aaa", "aaaa"));
        assertTrue(SOLUTION.isMatch("aa", ".*"));
    }

}