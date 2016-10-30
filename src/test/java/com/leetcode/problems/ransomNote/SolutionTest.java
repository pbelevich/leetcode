package com.leetcode.problems.ransomNote;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testCanConstruct() throws Exception {
        assertTrue(SOLUTION.canConstruct("", ""));
        assertFalse(SOLUTION.canConstruct("a", "b"));
        assertFalse(SOLUTION.canConstruct("aa", "ab"));
        assertTrue(SOLUTION.canConstruct("aa", "aab"));
    }

}