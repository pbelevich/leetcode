package com.leetcode.problems.gameOfLife;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void gameOfLife() throws Exception {
        int[][] board = {{1, 1}, {1, 0}};
        SOLUTION.gameOfLife(board);
    }

}