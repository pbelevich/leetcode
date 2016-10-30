package com.leetcode.problems.zigzagConversion.b;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testConvert() throws Exception {
//        assertEquals("AIRBHJPSCGKOTDFLNEM", SOLUTION.convert("ABCDEFGHIJKLMNOPRST", 5));
        assertEquals("PAHNAPLSIIGYIR", SOLUTION.convert("PAYPALISHIRING", 3));
    }

}