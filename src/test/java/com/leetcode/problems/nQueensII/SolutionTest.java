package com.leetcode.problems.nQueensII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void totalNQueens() throws Exception {
        assertEquals(1, new Solution().totalNQueens(1));
        assertEquals(0, new Solution().totalNQueens(2));
        assertEquals(0, new Solution().totalNQueens(3));
        assertEquals(2, new Solution().totalNQueens(4));
        assertEquals(10, new Solution().totalNQueens(5));
        assertEquals(92, new Solution().totalNQueens(8));
    }

}