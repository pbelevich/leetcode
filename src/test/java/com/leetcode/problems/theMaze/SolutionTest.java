package com.leetcode.problems.theMaze;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void hasPath1() throws Exception {
        assertTrue(new Solution().hasPath(new int[][]{
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0},
        }, new int[]{0, 4}, new int[]{4, 4}));
    }

    @Test
    public void hasPath2() throws Exception {
        assertFalse(new Solution().hasPath(new int[][]{
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0},
        }, new int[]{0, 4}, new int[]{3, 2}));
    }

}