package com.leetcode.problems.validSudoku;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/valid-sudoku/
 *
 * 36. Valid Sudoku
 *
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 *
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public static final char EMPTY = '.';

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                final char cRow = board[i][j];
                if (cRow != EMPTY && !row.add(cRow)) {
                    return false;
                }
                final char cCol = board[j][i];
                if (cCol != EMPTY && !col.add(cCol)) {
                    return false;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Set<Character> rect = new HashSet<>();
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        final char c = board[i * 3 + x][j * 3 + y];
                        if (c != EMPTY && !rect.add(c)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

}
