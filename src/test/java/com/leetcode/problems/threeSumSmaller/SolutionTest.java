package com.leetcode.problems.threeSumSmaller;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void threeSumSmaller() throws Exception {
        assertEquals(2, SOLUTION.threeSumSmaller(new int[]{-2, 0, 1, 3}, 2));
    }

}