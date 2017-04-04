package com.leetcode.problems.longestPalindrome;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void longestPalindrome() throws Exception {
        assertEquals(0, SOLUTION.longestPalindrome(""));
        assertEquals(1, SOLUTION.longestPalindrome("a"));
        assertEquals(1, SOLUTION.longestPalindrome("abc"));
        assertEquals(2, SOLUTION.longestPalindrome("aa"));
        assertEquals(3, SOLUTION.longestPalindrome("aaa"));
        assertEquals(7, SOLUTION.longestPalindrome("abccccdd"));
    }

}