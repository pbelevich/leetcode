package com.leetcode.problems.lineReflection;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void isReflected() throws Exception {
        assertTrue(SOLUTION.isReflected(new int[][]{{1, 1}, {-1, 1}}));
        assertFalse(SOLUTION.isReflected(new int[][]{{1, 1}, {-1, -1}}));
    }

}