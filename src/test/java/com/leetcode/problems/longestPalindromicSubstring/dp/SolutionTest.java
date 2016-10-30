package com.leetcode.problems.longestPalindromicSubstring.dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testLongestPalindrome() throws Exception {
        assertEquals(null, SOLUTION.longestPalindrome(null));
        assertEquals("", SOLUTION.longestPalindrome(""));
        assertEquals("a", SOLUTION.longestPalindrome("a"));
        assertEquals("aa", SOLUTION.longestPalindrome("aa"));
        assertEquals("aaa", SOLUTION.longestPalindrome("aaa"));
        assertEquals("aba", SOLUTION.longestPalindrome("aba"));
        assertEquals("bb", SOLUTION.longestPalindrome("abb"));
        assertEquals("abba", SOLUTION.longestPalindrome("abba"));
        assertEquals("ababa", SOLUTION.longestPalindrome("ababa"));
        assertEquals("baxabaxab", SOLUTION.longestPalindrome("abaxabaxabb"));
        assertEquals("baxabybaxab", SOLUTION.longestPalindrome("abaxabaxabybaxabyb"));
    }

}