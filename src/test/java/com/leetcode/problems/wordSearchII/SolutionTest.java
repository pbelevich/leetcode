package com.leetcode.problems.wordSearchII;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void findWords() throws Exception {
        final char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'},
        };
        assertEquals(Arrays.asList("oath", "eat"), SOLUTION.findWords(board, new String[]{"oath", "pea", "eat", "rain"}));
    }

}