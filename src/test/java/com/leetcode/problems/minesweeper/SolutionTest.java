package com.leetcode.problems.minesweeper;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void updateBoard() throws Exception {
        final char[][] board =
                {
                        {'E', 'E', 'E', 'E', 'E'},
                        {'E', 'E', 'M', 'E', 'E'},
                        {'E', 'E', 'E', 'E', 'E'},
                        {'E', 'E', 'E', 'E', 'E'}
                };
        new Solution().updateBoard(board, new int[]{3, 0});
        final char[][] expected =
                {
                        {'B', '1', 'E', '1', 'B'},
                        {'B', '1', 'M', '1', 'B'},
                        {'B', '1', '1', '1', 'B'},
                        {'B', 'B', 'B', 'B', 'B'}
                };
        assertArrayEquals(expected, board);
    }

    @Test
    public void updateBoardBoom() throws Exception {
        final char[][] board =
                {
                        {'B', '1', 'E', '1', 'B'},
                        {'B', '1', 'M', '1', 'B'},
                        {'B', '1', '1', '1', 'B'},
                        {'B', 'B', 'B', 'B', 'B'}
                };
        new Solution().updateBoard(board, new int[]{1, 2});
        final char[][] expected =
                {
                        {'B', '1', 'E', '1', 'B'},
                        {'B', '1', 'X', '1', 'B'},
                        {'B', '1', '1', '1', 'B'},
                        {'B', 'B', 'B', 'B', 'B'}
                };
        assertArrayEquals(expected, board);
    }

}