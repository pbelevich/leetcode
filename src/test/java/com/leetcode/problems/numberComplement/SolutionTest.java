package com.leetcode.problems.numberComplement;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void findComplement() throws Exception {
        assertEquals(2, SOLUTION.findComplement(5));
        assertEquals(0, SOLUTION.findComplement(1));
    }

}