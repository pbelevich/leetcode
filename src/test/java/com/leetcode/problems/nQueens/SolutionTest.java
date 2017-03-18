package com.leetcode.problems.nQueens;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void solveNQueens() throws Exception {
        assertEquals(Arrays.asList(
                Arrays.asList(".Q..", "...Q", "Q...", "..Q."),
                Arrays.asList("..Q.", "Q...", "...Q", ".Q..")), SOLUTION.solveNQueens(4));
        assertEquals(92,SOLUTION.solveNQueens(8).size());
    }

}