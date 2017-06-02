package com.leetcode.problems.encodeStringWithShortestLength;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void encode() throws Exception {
        assertEquals("aaa", SOLUTION.encode("aaa"));
        assertEquals("5[a]", SOLUTION.encode("aaaaa"));
        assertEquals("a9[a]", SOLUTION.encode("aaaaaaaaaa"));
        assertEquals("2[aabc]d", SOLUTION.encode("aabcaabcd"));
        assertEquals("2[2[abbb]c]", SOLUTION.encode("abbbabbbcabbbabbbc"));
    }

}