package com.leetcode.problems.removeDuplicateLetters;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void removeDuplicateLetters() throws Exception {
        assertEquals("abc", SOLUTION.removeDuplicateLetters("bcabc"));
        assertEquals("acdb", SOLUTION.removeDuplicateLetters("cbacdcbc"));
        assertEquals("ab", SOLUTION.removeDuplicateLetters("baab"));
        assertEquals("acb", SOLUTION.removeDuplicateLetters("ccacbaba"));
        assertEquals("abc", SOLUTION.removeDuplicateLetters("ababc"));
    }

}