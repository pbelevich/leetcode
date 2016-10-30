package com.leetcode.problems.gameOfLife;

public class Solution {

    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] |= (newValue(get(board, i, j), neighbors(board, i, j))) << 1;
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] >>= 1;
            }
        }
    }

    private short newValue(int value, int neighbors) {
        if (value == 1) {
            if (neighbors < 2 || neighbors > 3) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (neighbors == 3) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    private static int get(int[][] board, int i, int j) {
        if (0 <= i && i < board.length && 0 <= j && j < board[i].length) {
            return board[i][j] & 1;
        } else {
            return 0;
        }
    }

    private static int neighbors(int[][] board, int i, int j) {
        return get(board, i + 1, j + 1) + get(board, i, j + 1) + get(board, i - 1, j + 1) +
               get(board, i + 1, j    ) +                      + get(board, i - 1, j    ) +
               get(board, i + 1, j - 1) + get(board, i, j - 1) + get(board, i - 1, j - 1);
    }

}