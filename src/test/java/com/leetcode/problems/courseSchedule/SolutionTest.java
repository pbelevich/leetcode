package com.leetcode.problems.courseSchedule;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void canFinish() throws Exception {
        assertTrue(SOLUTION.canFinish(0, new int[][]{}));
        assertTrue(SOLUTION.canFinish(1, new int[][]{}));
        assertTrue(SOLUTION.canFinish(42, new int[][]{}));
        assertFalse(SOLUTION.canFinish(1, new int[][]{{0, 0}, {0, 0}}));
        assertTrue(SOLUTION.canFinish(2, new int[][]{{0, 1}}));
        assertTrue(SOLUTION.canFinish(2, new int[][]{{1, 0}}));
        assertFalse(SOLUTION.canFinish(2, new int[][]{{0, 1}, {1, 0}}));
        assertFalse(SOLUTION.canFinish(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}));
        assertTrue(SOLUTION.canFinish(3, new int[][]{{0, 2}, {1, 2}}));
        assertTrue(SOLUTION.canFinish(3, new int[][]{{0, 1}, {0, 2}, {1, 2}}));
    }

}