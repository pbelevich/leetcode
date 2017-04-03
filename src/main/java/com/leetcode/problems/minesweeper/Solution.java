package com.leetcode.problems.minesweeper;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;

/**
 * https://leetcode.com/problems/minesweeper/#/description
 * <p>
 * 529. Minesweeper
 * <p>
 * You are given a 2D char matrix representing the game board. 'M' represents an unrevealed mine, 'E' represents an unrevealed empty square, 'B' represents a revealed blank square that has no adjacent (above, below, left, right, and all 4 diagonals) mines, digit ('1' to '8') represents how many mines are adjacent to this revealed square, and finally 'X' represents a revealed mine.
 * <p>
 * Now given the next click position (row and column indices) among all the unrevealed squares ('M' or 'E'), return the board after revealing this position according to the following rules:
 * <p>
 * If a mine ('M') is revealed, then the game is over - change it to 'X'.
 * If an empty square ('E') with no adjacent mines is revealed, then change it to revealed blank ('B') and all of its adjacent unrevealed squares should be revealed recursively.
 * If an empty square ('E') with at least one adjacent mine is revealed, then change it to a digit ('1' to '8') representing the number of adjacent mines.
 * Return the board when no more squares will be revealed.
 *
 * @author Pavel Belevich
 */
public class Solution {

    private static final char M = 'M';
    private static final char X = 'X';
    private static final char E = 'E';
    private static final char B = 'B';

    private char[][] board;
    private int h;
    private int w;

    static class Cell {

        final int r;
        final int c;

        Cell(int r, int c) {
            this.r = r;
            this.c = c;
        }

    }

    public char[][] updateBoard(char[][] board, int[] click) {
        this.board = board;
        int r = click[0];
        int c = click[1];
        if (board[r][c] == M) {
            board[r][c] = X;
        }
        if (board[r][c] == E) {
            h = board.length;
            w = board[0].length;
            final boolean[][] added = new boolean[h][w];
            final Queue<Cell> queue = new ArrayDeque<>();

            queue.offer(new Cell(r, c));
            added[r][c] = true;

            while (!queue.isEmpty()) {
                final Cell cell = queue.poll();
                final char type = board[cell.r][cell.c];
                if (type == E) {
                    final int mines = mines(cell.r, cell.c);
                    if (mines == 0) {
                        final Collection<Cell> adj = adj(cell);
                        for (Cell a : adj) {
                            if (!added[a.r][a.c]) {
                                queue.add(a);
                                added[a.r][a.c] = true;
                            }
                        }
                        board[cell.r][cell.c] = B;
                    } else {
                        board[cell.r][cell.c] = (char) ('0' + mines);
                    }
                }
            }
        }
        return board;
    }

    Collection<Cell> adj(Cell c) {
        Collection<Cell> result = new ArrayList<>(8);

        if (isValid(c.r + 1, c.c + 1)) result.add(new Cell(c.r + 1, c.c + 1));
        if (isValid(c.r + 1, c.c)) result.add(new Cell(c.r + 1, c.c));
        if (isValid(c.r + 1, c.c - 1)) result.add(new Cell(c.r + 1, c.c - 1));

        if (isValid(c.r, c.c + 1)) result.add(new Cell(c.r, c.c + 1));
        if (isValid(c.r, c.c - 1)) result.add(new Cell(c.r, c.c - 1));

        if (isValid(c.r - 1, c.c + 1)) result.add(new Cell(c.r - 1, c.c + 1));
        if (isValid(c.r - 1, c.c)) result.add(new Cell(c.r - 1, c.c));
        if (isValid(c.r - 1, c.c - 1)) result.add(new Cell(c.r - 1, c.c - 1));

        return result;
    }

    int mines(int r, int c) {
        int result = 0;

        if (isValid(r + 1, c + 1) && board[r + 1][c + 1] == M) result++;
        if (isValid(r + 1, c) && board[r + 1][c] == M) result++;
        if (isValid(r + 1, c - 1) && board[r + 1][c - 1] == M) result++;

        if (isValid(r, c + 1) && board[r][c + 1] == M) result++;
        if (isValid(r, c) && board[r][c] == M) result++;
        if (isValid(r, c - 1) && board[r][c - 1] == M) result++;

        if (isValid(r - 1, c + 1) && board[r - 1][c + 1] == M) result++;
        if (isValid(r - 1, c) && board[r - 1][c] == M) result++;
        if (isValid(r - 1, c - 1) && board[r - 1][c - 1] == M) result++;

        return result;
    }

    boolean isValid(int r, int c) {
        return r >= 0 && r < h && c >= 0 && c < w;
    }

}
