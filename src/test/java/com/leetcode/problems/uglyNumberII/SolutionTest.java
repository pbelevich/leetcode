package com.leetcode.problems.uglyNumberII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void nthUglyNumber() throws Exception {
        assertEquals(16, SOLUTION.nthUglyNumber(12));
    }

}