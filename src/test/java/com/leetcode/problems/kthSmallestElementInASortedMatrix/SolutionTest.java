package com.leetcode.problems.kthSmallestElementInASortedMatrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testKthSmallest() throws Exception {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        assertEquals(1, SOLUTION.kthSmallest(matrix, 1));
        assertEquals(5, SOLUTION.kthSmallest(matrix, 2));
        assertEquals(10, SOLUTION.kthSmallest(matrix, 3));
        assertEquals(9, SOLUTION.kthSmallest(matrix, 4));
    }

}