package com.leetcode.problems.searchForARange;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void searchRange() throws Exception {
        assertArrayEquals(new int[]{0, 0}, SOLUTION.searchRange(new int[]{1}, 1));
        assertArrayEquals(new int[]{1, 2}, SOLUTION.searchRange(new int[]{1, 2, 2, 3}, 2));
        assertArrayEquals(new int[]{1, 3}, SOLUTION.searchRange(new int[]{1, 2, 2, 2, 3}, 2));
        assertArrayEquals(new int[]{1, 2}, SOLUTION.searchRange(new int[]{1, 2, 2, 3, 4}, 2));
        assertArrayEquals(new int[]{1, 3}, SOLUTION.searchRange(new int[]{1, 2, 2, 2, 3, 4}, 2));
        assertArrayEquals(new int[]{0, 2}, SOLUTION.searchRange(new int[]{2, 2, 2, 3, 4}, 2));
        assertArrayEquals(new int[]{3, 4}, SOLUTION.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
        assertArrayEquals(new int[]{1, 2}, SOLUTION.searchRange(new int[]{1, 2, 2}, 2));
    }

}