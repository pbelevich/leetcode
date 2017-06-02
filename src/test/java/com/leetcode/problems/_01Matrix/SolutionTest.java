package com.leetcode.problems._01Matrix;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void updateMatrix() throws Exception {
        assertTrue(Arrays.deepEquals(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}, SOLUTION.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}})));
        assertTrue(Arrays.deepEquals(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}}, SOLUTION.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}})));
    }

}