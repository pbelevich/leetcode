package com.leetcode.problems.zigzagConversion.a;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testConvert() throws Exception {
        assertEquals("PAHNAPLSIIGYIR", SOLUTION.convert("PAYPALISHIRING", 3));
    }

}