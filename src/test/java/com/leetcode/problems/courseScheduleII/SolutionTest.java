package com.leetcode.problems.courseScheduleII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void findOrder() throws Exception {
        assertArrayEquals(new int[]{}, SOLUTION.findOrder(0, new int[][]{}));
        assertArrayEquals(new int[]{0, 1, 2}, SOLUTION.findOrder(3, new int[][]{}));
        assertArrayEquals(new int[]{}, SOLUTION.findOrder(3, new int[][]{{0, 1}, {1, 0}}));
        assertArrayEquals(new int[]{0, 1}, SOLUTION.findOrder(2, new int[][]{{1, 0}}));
        assertArrayEquals(new int[]{1, 0}, SOLUTION.findOrder(2, new int[][]{{0, 1}}));
        assertArrayEquals(new int[]{0, 1, 2, 3}, SOLUTION.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}));
    }

}