package com.leetcode.problems.wordSearch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void exist() throws Exception {
        final char[][] board = {
                new char[]{'A', 'B', 'C', 'E'},
                new char[]{'S', 'F', 'C', 'S'},
                new char[]{'A', 'D', 'E', 'E'},
        };
        assertTrue(SOLUTION.exist(board, "ABCCED"));
        assertTrue(SOLUTION.exist(board, "SEE"));
        assertFalse(SOLUTION.exist(board, "ABCB"));

        assertTrue(SOLUTION.exist(new char[][] {{'a'}}, "a"));
    }

}