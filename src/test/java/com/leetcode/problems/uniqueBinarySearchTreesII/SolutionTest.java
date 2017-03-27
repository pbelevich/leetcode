package com.leetcode.problems.uniqueBinarySearchTreesII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void generateTrees() throws Exception {
        assertEquals(1, SOLUTION.generateTrees(0).size());
        assertEquals(1, SOLUTION.generateTrees(1).size());
        assertEquals(2, SOLUTION.generateTrees(2).size());
        assertEquals(5, SOLUTION.generateTrees(3).size());
        assertEquals(14, SOLUTION.generateTrees(4).size());
        assertEquals(42, SOLUTION.generateTrees(5).size());
        assertEquals(132, SOLUTION.generateTrees(6).size());
        assertEquals(429, SOLUTION.generateTrees(7).size());
        assertEquals(1430, SOLUTION.generateTrees(8).size());
        assertEquals(4862, SOLUTION.generateTrees(9).size());
        assertEquals(16796, SOLUTION.generateTrees(10).size());
    }

}