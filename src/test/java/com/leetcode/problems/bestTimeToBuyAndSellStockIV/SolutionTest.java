package com.leetcode.problems.bestTimeToBuyAndSellStockIV;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void maxProfit0() throws Exception {
        assertEquals(0, SOLUTION.maxProfit(2, new int[]{}));
    }

    @Test
    public void maxProfit1() throws Exception {
        assertEquals(469, SOLUTION.maxProfit(7, new int[]{48, 12, 60, 93, 97, 42, 25, 64, 17, 56, 85, 93, 9, 48, 52, 42, 58, 85, 81, 84, 69, 36, 1, 54, 23, 15, 72, 15, 11, 94}));
    }

    @Test
    public void maxProfit2() throws Exception {
        assertEquals(482, SOLUTION.maxProfit(Integer.MAX_VALUE, new int[]{48, 12, 60, 93, 97, 42, 25, 64, 17, 56, 85, 93, 9, 48, 52, 42, 58, 85, 81, 84, 69, 36, 1, 54, 23, 15, 72, 15, 11, 94}));
    }

}