package com.leetcode.problems.shortestPalindrome;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void shortestPalindrome() throws Exception {
        assertEquals("aaacecaaa", SOLUTION.shortestPalindrome("aacecaaa"));
        assertEquals("dcbabcd", SOLUTION.shortestPalindrome("abcd"));
    }

}