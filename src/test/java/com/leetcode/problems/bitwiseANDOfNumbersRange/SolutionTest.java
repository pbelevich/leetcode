package com.leetcode.problems.bitwiseANDOfNumbersRange;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void rangeBitwiseAnd() throws Exception {
//        assertEquals(0, SOLUTION.rangeBitwiseAnd(0, 0));
//        assertEquals(1, SOLUTION.rangeBitwiseAnd(1, 1));
//        assertEquals(4, SOLUTION.rangeBitwiseAnd(5, 7));
//        assertEquals(0, SOLUTION.rangeBitwiseAnd(2, 4));
        assertEquals(0, SOLUTION.rangeBitwiseAnd(3, 4));
    }

}