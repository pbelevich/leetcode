package com.leetcode.problems.designTicTacToe;

/**
 * https://leetcode.com/problems/design-tic-tac-toe/#/description
 * <p>
 * 348. Design Tic-Tac-Toe
 *
 * @author Pavel Belevich
 */
public class TicTacToe {

    private int n;
    private int[] rows;
    private int[] cols;
    private int diagonal;
    private int antiDiagonal;

    /**
     * Initialize your data structure here.
     */
    public TicTacToe(int n) {
        this.n = n;
        this.rows = new int[n];
        this.cols = new int[n];
    }

    /**
     * Player {player} makes a move at ({row}, {col}).
     *
     * @param row    The row of the board.
     * @param col    The column of the board.
     * @param player The player, can be either 1 or 2.
     * @return The current winning condition, can be either:
     * 0: No one wins.
     * 1: Player 1 wins.
     * 2: Player 2 wins.
     */
    public int move(int row, int col, int player) {
        int val = player == 1 ? 1 : -1;

        rows[row] += val;
        cols[col] += val;

        if (row == col) {
            diagonal += val;
        }

        if (row + col == n - 1) {
            antiDiagonal += val;
        }

        if (Math.abs(rows[row]) == n ||
                Math.abs(cols[col]) == n ||
                Math.abs(diagonal) == n ||
                Math.abs(antiDiagonal) == n) {
            return player;
        }

        return 0;
    }

}
