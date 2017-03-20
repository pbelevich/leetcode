package com.leetcode.problems.powXN;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void myPow() throws Exception {
        assertEquals(Math.pow(3.14, 7), SOLUTION.myPow(3.14, 7), 1e-9);
        assertEquals(Math.pow(-3.14, 7), SOLUTION.myPow(-3.14, 7), 1e-9);
        assertEquals(Math.pow(3.14, -7), SOLUTION.myPow(3.14, -7), 1e-9);
        assertEquals(Math.pow(-3.14, -7), SOLUTION.myPow(-3.14, -7), 1e-9);
        assertEquals(Math.pow(3.14, 0), SOLUTION.myPow(3.14, 0), 1e-9);
        assertEquals(Math.pow(-3.14, 0), SOLUTION.myPow(-3.14, 0), 1e-9);

        assertEquals(Math.pow(1.0, -2147483648), SOLUTION.myPow(1.0, -2147483648), 1e-9);
        assertEquals(Math.pow(3.14, -2147483648), SOLUTION.myPow(3.14, -2147483648), 1e-9);
    }

}