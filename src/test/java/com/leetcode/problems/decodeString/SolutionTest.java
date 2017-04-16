package com.leetcode.problems.decodeString;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void decodeString() throws Exception {
        assertEquals("aaabcbc", SOLUTION.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", SOLUTION.decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", SOLUTION.decodeString("2[abc]3[cd]ef"));
    }

}