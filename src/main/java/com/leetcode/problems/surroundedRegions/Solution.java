package com.leetcode.problems.surroundedRegions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;

/**
 * https://leetcode.com/problems/surrounded-regions/
 * <p>
 * 130. Surrounded Regions
 * <p>
 * Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
 * <p>
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 * <p>
 * For example,
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * After running your function, the board should be:
 * <p>
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 *
 * @author Pavel Belevich
 */
public class Solution {

    public static final char O = 'O';
    public static final char X = 'X';
    public static final char HASH = '#';

    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) {
            return;
        }
        boolean[] marked = new boolean[board.length * board[0].length];
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == O) {
                final int id = id(board, i, 0);
                queue.offer(id);
                marked[id] = true;
            }
            if (board[i][board[i].length - 1] == O) {
                final int id = id(board, i, board[i].length - 1);
                queue.offer(id);
                marked[id] = true;
            }
        }
        for (int j = 1; j < board[0].length - 1; j++) {
            if (board[0][j] == O) {
                final int id = id(board, 0, j);
                queue.offer(id);
                marked[id] = true;
            }
            if (board[board.length - 1][j] == O) {
                final int id = id(board, board.length - 1, j);
                queue.offer(id);
                marked[id] = true;
            }
        }

        while (!queue.isEmpty()) {
            final Integer id = queue.poll();
            int i = id / board[0].length;
            int j = id % board[0].length;
            board[i][j] = HASH;
            for (Integer adj : adj(board, i, j)) {
                if (!marked[adj]) {
                    queue.offer(adj);
                    marked[adj] = true;
                }
            }
        }

        for (int i = 1; i < board.length - 1; i++) {
            for (int j = 1; j < board[i].length - 1; j++) {
                if (board[i][j] == O) {
                    board[i][j] = X;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == HASH) {
                    board[i][j] = O;
                }
            }
        }

    }

    int id(char[][] board, int i, int j) {
        return i * board[0].length + j;
    }

    Iterable<Integer> adj(char[][] board, int i, int j) {
        Collection<Integer> result = new ArrayList<>(9);
        if (isValid(board, i + 1, j) && board[i + 1][j] == O) {
            result.add(id(board, i + 1, j));
        }
        if (isValid(board, i - 1, j) && board[i - 1][j] == O) {
            result.add(id(board, i - 1, j));
        }
        if (isValid(board, i, j + 1) && board[i][j + 1] == O) {
            result.add(id(board, i, j + 1));
        }
        if (isValid(board, i, j - 1) && board[i][j - 1] == O) {
            result.add(id(board, i, j - 1));
        }
        return result;
    }

    boolean isValid(char[][] board, int i, int j) {
        return i >= 0 && j >= 0 && i < board.length && j < board[i].length;
    }

}
