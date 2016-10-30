package com.leetcode.problems.sumOfTwoIntegers;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void getSum() throws Exception {
        assertEquals(0, SOLUTION.getSum(0, 0));
        assertEquals(1, SOLUTION.getSum(0, 1));
        assertEquals(1, SOLUTION.getSum(1, 0));
        assertEquals(2, SOLUTION.getSum(1, 1));

        assertEquals(0, SOLUTION.getSum(1, -1));

        assertEquals(10692745, SOLUTION.getSum(2387573, 8305172));
        assertEquals(5917599, SOLUTION.getSum(-2387573, 8305172));
    }

}