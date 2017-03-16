package com.leetcode.problems.sudokuSolver;

/**
 * https://leetcode.com/problems/sudoku-solver/#/description
 * <p>
 * 37. Sudoku Solver
 * <p>
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * <p>
 * Empty cells are indicated by the character '.'.
 * <p>
 * You may assume that there will be only one unique solution.
 *
 * @author Pavel Belevich
 */
public class Solution {

    private static final int ALL = 0b1111111110;
    private static final char ZERO = '0';
    private static final char EMPTY = '.';
    private static int[] bit = new int[]{
            0b1,
            0b10,
            0b100,
            0b1000,
            0b10000,
            0b100000,
            0b1000000,
            0b10000000,
            0b100000000,
            0b1000000000,
    };

    private int[] rows = new int[9];
    private int[] cols = new int[9];
    private int[][] squares = new int[3][3];
    private int dots = 0;

    public void solveSudoku(char[][] board) {
        init(board);
        if (dots > 0) solve1(board);
        if (dots > 0) solve2(board);
    }

    private void init(char[][] board) {
        for (int i = 0; i < 9; i++) {
            rows[i] = ALL;
            cols[i] = ALL;
            final char[] row = board[i];
            for (int j = 0; j < 9; j++) {
                final char cRow = row[j];
                if (cRow != EMPTY) {
                    final int digit = cRow - ZERO;
                    rows[i] ^= bit[digit];
                }
                final char cCol = board[j][i];
                if (cCol != EMPTY) {
                    final int digit = cCol - ZERO;
                    cols[i] ^= bit[digit];
                }
                if (cRow == '.') {
                    dots++;
                }
            }
        }
        for (int R = 0; R < 3; R++) {
            final int R3 = 3 * R;
            for (int C = 0; C < 3; C++) {
                final int C3 = 3 * C;
                squares[R][C] = ALL;
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        final int i = R3 + r;
                        final int j = C3 + c;
                        char ch = board[i][j];
                        if (ch != EMPTY) {
                            final int digit = ch - ZERO;
                            squares[R][C] ^= bit[digit];
                        }
                    }
                }
            }
        }
    }

    private void solve1(char[][] board) {
        boolean canSolve = true;
        while (dots > 0 && canSolve) {
            canSolve = false;
            for (int R = 0; R < 3; R++) {
                final int R3 = 3 * R;
                for (int C = 0; C < 3; C++) {
                    final int C3 = 3 * C;
                    for (int r = 0; r < 3; r++) {
                        for (int c = 0; c < 3; c++) {
                            final int i = R3 + r;
                            final int j = C3 + c;
                            char ch = board[i][j];
                            if (ch == EMPTY) {
                                final int x = rows[i] & cols[j] & squares[R][C];
                                if ((x & (x - 1)) == 0) {
                                    board[i][j] = (char) (ZERO + power(x));
                                    rows[i] ^= x;
                                    cols[j] ^= x;
                                    squares[R][C] ^= x;
                                    canSolve = true;
                                    dots--;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean solve2(char[][] board) {
        for (int R = 0; R < 3; R++) {
            final int R3 = 3 * R;
            for (int C = 0; C < 3; C++) {
                final int C3 = 3 * C;
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        final int i = R3 + r;
                        final int j = C3 + c;
                        char ch = board[i][j];
                        if (ch == EMPTY) {
                            final int x = rows[i] & cols[j] & squares[R][C];
                            for (int k = 1; k <= 9; k++) {
                                final int b = bit[k];
                                if ((x & b) == b) {
                                    board[i][j] = (char) (k + ZERO);
                                    rows[i] ^= b;
                                    cols[j] ^= b;
                                    squares[R][C] ^= b;
                                    dots--;
                                    if (dots == 0 || solve2(board)) {
                                        return true;
                                    }
                                    board[i][j] = EMPTY;
                                    rows[i] ^= b;
                                    cols[j] ^= b;
                                    squares[R][C] ^= b;
                                    dots++;
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private static int power(int x) {
        int result = 0;
        for (; x != 1; x >>= 1) {
            result++;
        }
        return result;
    }

}
