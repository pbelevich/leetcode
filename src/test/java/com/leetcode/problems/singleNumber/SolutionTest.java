package com.leetcode.problems.singleNumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void singleNumber() throws Exception {
        assertEquals(6, new Solution().singleNumber(new int[] {3, 1, 5, 2, 4, 4, 6, 3, 2, 1, 5}));
    }

}