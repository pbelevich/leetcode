package com.leetcode.problems.productOfArrayExceptSelf;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void productExceptSelf() throws Exception {
        assertArrayEquals(new int[] {24, 12, 8, 6}, new Solution().productExceptSelf(new int[] {1, 2, 3, 4}));
    }

}