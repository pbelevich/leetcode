package com.leetcode.problems.fractionToRecurringDecimal;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testFractionToDecimal() throws Exception {
        assertEquals("0.5", SOLUTION.fractionToDecimal(1, 2));
        assertEquals("2", SOLUTION.fractionToDecimal(2, 1));
        assertEquals("0.(6)", SOLUTION.fractionToDecimal(2, 3));
        assertEquals("-4.50(123)", SOLUTION.fractionToDecimal(-449673, 99900));
        assertEquals("0", SOLUTION.fractionToDecimal(0, -5));
        assertEquals("0.0000000004656612873077392578125", SOLUTION.fractionToDecimal(-1, -2147483648));
    }

}