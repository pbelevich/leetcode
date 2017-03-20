package com.leetcode.problems.selfCrossing;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void isSelfCrossing() throws Exception {
        assertFalse(SOLUTION.isSelfCrossing(new int[]{1}));
        assertTrue(SOLUTION.isSelfCrossing(new int[]{2, 1, 1, 2}));
        assertFalse(SOLUTION.isSelfCrossing(new int[]{1, 2, 3, 4}));
        assertTrue(SOLUTION.isSelfCrossing(new int[]{1, 1, 1, 1}));
        assertTrue(SOLUTION.isSelfCrossing(new int[]{1, 1, 2, 1, 1}));
        assertTrue(SOLUTION.isSelfCrossing(new int[]{1, 1, 2, 2, 1, 1}));
    }

}