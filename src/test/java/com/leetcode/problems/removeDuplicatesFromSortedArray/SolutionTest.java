package com.leetcode.problems.removeDuplicatesFromSortedArray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void removeDuplicates() throws Exception {
        assertEquals(5, SOLUTION.removeDuplicates(new int[]{1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 5}));
        assertEquals(3, SOLUTION.removeDuplicates(new int[]{1, 2, 3}));
        assertEquals(0, SOLUTION.removeDuplicates(new int[]{}));
        assertEquals(1, SOLUTION.removeDuplicates(new int[]{1}));
    }

}