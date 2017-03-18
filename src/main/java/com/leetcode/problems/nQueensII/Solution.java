package com.leetcode.problems.nQueensII;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/n-queens-ii/#/description
 * <p>
 * 52. N-Queens II
 * <p>
 * Follow up for N-Queens problem.
 * <p>
 * Now, instead outputting board configurations, return the total number of distinct solutions.
 *
 * @author Pavel Belevich
 */
public class Solution {

    private int result = 0;

    public int totalNQueens(int n) {
        int[][] board = new int[n][n];
        int[] solution = new int[n];
        Arrays.fill(solution, -1);
        solveNQueens(board, 0, solution);
        return result;
    }

    void solveNQueens(int[][] board, int r, int[] solution) {
        if (r == board.length) {
            result++;
        } else {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == 0) {
                    putQueen(board, r, c);
                    solution[r] = c;
                    solveNQueens(board, r + 1, solution);
                    solution[r] = -1;
                    removeQueen(board, r, c);
                }
            }
        }
    }

    void putQueen(int[][] board, int r, int c) {
        changeBoard(board, r, c, 1);
    }

    void removeQueen(int[][] board, int r, int c) {
        changeBoard(board, r, c, -1);
    }

    void changeBoard(int[][] board, int r, int c, int delta) {
        for (int i = 0; i < board.length; i++) {
            board[r][i] += delta;
            board[i][c] += delta;
        }
        for (int i = 0; i < board.length; i++) {
            changeBoard2(board, r + i, c + i, delta);
            changeBoard2(board, r + i, c - i, delta);
            changeBoard2(board, r - i, c + i, delta);
            changeBoard2(board, r - i, c - i, delta);
        }
    }

    void changeBoard2(int[][] board, int r, int c, int delta) {
        if (r >= 0 && r < board.length && c >= 0 && c < board[r].length) {
            board[r][c] += delta;
        }
    }

}
