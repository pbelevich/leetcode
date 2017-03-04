package com.leetcode.problems.firstMissingPositive;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void firstMissingPositive() throws Exception {
        assertEquals(3, SOLUTION.firstMissingPositive(new int[]{1, 2, 0}));
        assertEquals(2, SOLUTION.firstMissingPositive(new int[]{3, 4, -1, 1}));

        assertEquals(4, SOLUTION.firstMissingPositive(new int[]{3, -10, 6, -5, 2, -1, 5, 1, -3}));

    }

}