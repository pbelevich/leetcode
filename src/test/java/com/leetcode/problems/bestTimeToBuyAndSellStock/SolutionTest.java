package com.leetcode.problems.bestTimeToBuyAndSellStock;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void maxProfit() throws Exception {
        assertEquals(5, SOLUTION.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, SOLUTION.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

}