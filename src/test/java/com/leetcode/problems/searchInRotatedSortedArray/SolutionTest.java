package com.leetcode.problems.searchInRotatedSortedArray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void search() throws Exception {
        assertEquals(0, SOLUTION.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 4));
        assertEquals(1, SOLUTION.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 5));
        assertEquals(2, SOLUTION.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 6));
        assertEquals(3, SOLUTION.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 7));
        assertEquals(4, SOLUTION.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(5, SOLUTION.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 1));
        assertEquals(6, SOLUTION.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 2));
        assertEquals(-1, SOLUTION.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 10));
        assertEquals(-1, SOLUTION.search(new int[0], 10));
        assertEquals(0, SOLUTION.search(new int[] {1, 2, 3, 4, 5}, 1));
        assertEquals(1, SOLUTION.search(new int[] {1, 2, 3, 4, 5}, 2));
        assertEquals(2, SOLUTION.search(new int[] {1, 2, 3, 4, 5}, 3));
        assertEquals(3, SOLUTION.search(new int[] {1, 2, 3, 4, 5}, 4));
        assertEquals(4, SOLUTION.search(new int[] {1, 2, 3, 4, 5}, 5));
        assertEquals(-1, SOLUTION.search(new int[] {1, 2, 3, 4, 5}, 6));
        assertEquals(1, SOLUTION.search(new int[] {1, 3}, 3));

    }

}