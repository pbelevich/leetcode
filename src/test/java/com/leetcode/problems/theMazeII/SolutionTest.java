package com.leetcode.problems.theMazeII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void shortestDistance1() throws Exception {
        assertEquals(12, new Solution().shortestDistance(new int[][]{
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0},
        }, new int[]{0, 4}, new int[]{4, 4}));
    }

    @Test
    public void shortestDistance2() throws Exception {
        assertEquals(-1, new Solution().shortestDistance(new int[][]{
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0},
        }, new int[]{0, 4}, new int[]{3, 2}));
    }

}