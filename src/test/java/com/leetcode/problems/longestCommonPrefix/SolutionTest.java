package com.leetcode.problems.longestCommonPrefix;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void longestCommonPrefix() throws Exception {
        assertEquals("", SOLUTION.longestCommonPrefix(new String[] {}));
        assertEquals("", SOLUTION.longestCommonPrefix(new String[] {"a", "b", "c"}));
        assertEquals("ab", SOLUTION.longestCommonPrefix(new String[] {"abc", "abd", "abe"}));
    }

}