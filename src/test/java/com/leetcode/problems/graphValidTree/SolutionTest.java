package com.leetcode.problems.graphValidTree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void validTree() throws Exception {
        assertTrue(SOLUTION.validTree(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}}));
        assertFalse(SOLUTION.validTree(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}}));
        assertFalse(SOLUTION.validTree(4, new int[][]{{0, 1}, {2, 3}}));
    }

}