package com.leetcode.problems.decodeWays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void numDecodings() throws Exception {
        assertEquals(0, SOLUTION.numDecodings(""));
        assertEquals(0, SOLUTION.numDecodings("0"));
        assertEquals(3, SOLUTION.numDecodings("112"));
        assertEquals(2, SOLUTION.numDecodings("26"));
    }

}