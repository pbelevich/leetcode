package com.leetcode.problems.coinChange;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void coinChange() throws Exception {
        assertEquals(3, new Solution().coinChange(new int[]{5, 1, 2}, 11));
        assertEquals(-1, new Solution().coinChange(new int[]{2}, 3));
        assertEquals(20, new Solution().coinChange(new int[]{186, 419, 83, 408}, 6249));
    }

}