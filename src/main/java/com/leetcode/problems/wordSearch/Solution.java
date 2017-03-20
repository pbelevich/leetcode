package com.leetcode.problems.wordSearch;

/**
 * https://leetcode.com/problems/word-search/#/description
 * <p>
 * 79. Word Search
 * <p>
 * Given a 2D board and a word, find if the word exists in the grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * <p>
 * For example,
 * Given board =
 * <p>
 * [
 * ['A','B','C','E'],
 * ['S','F','C','S'],
 * ['A','D','E','E']
 * ]
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public boolean exist(char[][] board, String word) {
        final char[] chars = word.toCharArray();
        final boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (chars[0] == board[i][j]) {
                    if (exist(board, i, j, chars, 0, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] board, int i, int j, char[] chars, int k, boolean[][] visited) {
        if (k == chars.length) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length) {
            return false;
        }
        if (visited[i][j]) {
            return false;
        }
        boolean result = false;
        if (board[i][j] == chars[k]) {
            visited[i][j] = true;
            result = exist(board, i + 1, j, chars, k + 1, visited) ||
                    exist(board, i, j + 1, chars, k + 1, visited) ||
                    exist(board, i - 1, j, chars, k + 1, visited) ||
                    exist(board, i, j - 1, chars, k + 1, visited);
            visited[i][j] = false;
        }
        return result;
    }

}
