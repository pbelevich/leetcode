package com.leetcode.problems.uniquePaths;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void uniquePaths() throws Exception {
        assertEquals(1, SOLUTION.uniquePaths(2, 1));
        assertEquals(1, SOLUTION.uniquePaths(1, 2));
        assertEquals(2, SOLUTION.uniquePaths(2, 2));
        assertEquals(3, SOLUTION.uniquePaths(2, 3));
        assertEquals(3, SOLUTION.uniquePaths(3, 2));
        assertEquals(6, SOLUTION.uniquePaths(3, 3));
    }

}