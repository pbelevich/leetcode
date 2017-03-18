package com.leetcode.problems.nQueens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/n-queens/#/description
 *
 * 51. N-Queens
 *
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
 *
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 *
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
 *
 * For example,
 * There exist two distinct solutions to the 4-queens puzzle:
 *
 * [
 * [".Q..",  // Solution 1
 * "...Q",
 * "Q...",
 * "..Q."],
 *
 * ["..Q.",  // Solution 2
 * "Q...",
 * "...Q",
 * ".Q.."]
 * ]
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[][] board = new int[n][n];
        int[] solution = new int[n];
        Arrays.fill(solution, -1);
        solveNQueens(board, 0, solution, result);
        return result;
    }

    void solveNQueens(int[][] board, int r, int[] solution, List<List<String>> result) {
        if (r == board.length) {
            result.add(make(solution));
        } else {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == 0) {
                    putQueen(board, r, c);
                    solution[r] = c;
                    solveNQueens(board, r + 1, solution, result);
                    solution[r] = -1;
                    removeQueen(board, r, c);
                }
            }
        }
    }

    List<String> make(int[] solution) {
        List<String> result = new ArrayList<>(solution.length);
        for (int r = 0; r < solution.length; r++) {
            char[] chars = new char[solution.length];
            for (int c = 0; c < solution.length; c++) {
                chars[c] = solution[r] == c ? 'Q' : '.';
            }
            result.add(new String(chars));
        }
        return result;
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
