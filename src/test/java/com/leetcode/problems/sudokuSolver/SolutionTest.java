package com.leetcode.problems.sudokuSolver;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();
    public static final com.leetcode.problems.validSudoku.Solution VALIDATOR = new com.leetcode.problems.validSudoku.Solution();

    @Test
    public void solveSudoku() throws Exception {
        final char[][] board = {
                "53..7....".toCharArray(),
                "6..195...".toCharArray(),
                ".98....6.".toCharArray(),
                "8...6...3".toCharArray(),
                "4..8.3..1".toCharArray(),
                "7...2...6".toCharArray(),
                ".6....28.".toCharArray(),
                "...419..5".toCharArray(),
                "....8..79".toCharArray(),
        };
        SOLUTION.solveSudoku(board);
        assertTrue(VALIDATOR.isValidSudoku(board));
    }

    @Test
    public void solveSudoku1() throws Exception {
        final char[][] board = {
                "..9748...".toCharArray(),
                "7........".toCharArray(),
                ".2.1.9...".toCharArray(),
                "..7...24.".toCharArray(),
                ".64.1.59.".toCharArray(),
                ".98...3..".toCharArray(),
                "...8.3.2.".toCharArray(),
                "........6".toCharArray(),
                "...2759..".toCharArray(),
        };
        SOLUTION.solveSudoku(board);
        assertTrue(VALIDATOR.isValidSudoku(board));
    }

}