package com.leetcode.problems.numberOfConnectedComponentsInAnUndirectedGraph;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void countComponents() throws Exception {
        assertEquals(2, SOLUTION.countComponents(5, new int[][]{{0, 1}, {1, 2}, {3, 4}}));
        assertEquals(1, SOLUTION.countComponents(5, new int[][]{{0, 1}, {1, 2}, {3, 4}, {2, 3}}));
    }

}