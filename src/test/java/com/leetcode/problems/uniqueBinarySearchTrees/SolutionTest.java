package com.leetcode.problems.uniqueBinarySearchTrees;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void numTrees() throws Exception {
        assertEquals(1, SOLUTION.numTrees(0));
        assertEquals(1, SOLUTION.numTrees(1));
        assertEquals(2, SOLUTION.numTrees(2));
        assertEquals(5, SOLUTION.numTrees(3));
        assertEquals(14, SOLUTION.numTrees(4));
        assertEquals(42, SOLUTION.numTrees(5));
        assertEquals(132, SOLUTION.numTrees(6));
        assertEquals(429, SOLUTION.numTrees(7));
        assertEquals(1430, SOLUTION.numTrees(8));
        assertEquals(4862, SOLUTION.numTrees(9));
        assertEquals(16796, SOLUTION.numTrees(10));
        assertEquals(1767263190, SOLUTION.numTrees(19));
    }

}