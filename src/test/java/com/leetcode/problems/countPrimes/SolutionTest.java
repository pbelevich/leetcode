package com.leetcode.problems.countPrimes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void countPrimes() throws Exception {
        assertEquals(4, SOLUTION.countPrimes(10));
        assertEquals(8, SOLUTION.countPrimes(20));
        assertEquals(25, SOLUTION.countPrimes(100));
        assertEquals(25, SOLUTION.countPrimes(101));
    }

}