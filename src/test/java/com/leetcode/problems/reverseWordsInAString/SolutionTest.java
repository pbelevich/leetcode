package com.leetcode.problems.reverseWordsInAString;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testReverse() {
        char[] chars = "the sky is blue".toCharArray();
        Solution.reverse(chars, 0, 3);
        assertEquals("eht sky is blue", new String(chars));
    }

    @Test
    public void testReverseWords() throws Exception {
        assertEquals("", SOLUTION.reverseWords(" "));
        assertEquals("blue is sky the", SOLUTION.reverseWords("the sky is blue"));
        assertEquals("b a", SOLUTION.reverseWords("   a   b "));
        assertEquals("a", SOLUTION.reverseWords("a"));
    }

}