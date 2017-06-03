package com.leetcode.problems.bestTimeToBuyAndSellStockII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void maxProfit() throws Exception {
        assertEquals(6, new Solution().maxProfit(new int[] {10, 8, 9, 6, 5, 10}));
    }

}