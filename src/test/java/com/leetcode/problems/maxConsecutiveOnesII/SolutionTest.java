package com.leetcode.problems.maxConsecutiveOnesII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void findMaxConsecutiveOnes1() throws Exception {
        assertEquals(1, SOLUTION.findMaxConsecutiveOnes(new int[]{1}));
    }

    @Test
    public void findMaxConsecutiveOnes() throws Exception {
        assertEquals(4, SOLUTION.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0}));
    }

}