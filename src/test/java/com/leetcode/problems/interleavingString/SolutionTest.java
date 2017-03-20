package com.leetcode.problems.interleavingString;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void isInterleave() throws Exception {
        assertTrue(SOLUTION.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        assertFalse(SOLUTION.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

}