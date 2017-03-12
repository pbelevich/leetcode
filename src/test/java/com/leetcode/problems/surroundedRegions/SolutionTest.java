package com.leetcode.problems.surroundedRegions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void solve() throws Exception {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        SOLUTION.solve(board);
        char[][] expected = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        assertArrayEquals(expected, board);

        board = new char[][]{
                "XOXOXO".toCharArray(),
                "OXOXOX".toCharArray(),
                "XOXOXO".toCharArray(),
                "OXOXOX".toCharArray()
        };
        SOLUTION.solve(board);
        expected = new char[][]{
                "XOXOXO".toCharArray(),
                "OXXXXX".toCharArray(),
                "XXXXXO".toCharArray(),
                "OXOXOX".toCharArray()
        };
        assertArrayEquals(expected, board);
    }

}