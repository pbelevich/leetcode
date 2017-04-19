package com.leetcode.problems.threeSum;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testThreeSum() throws Exception {
        final List<List<Integer>> actual = SOLUTION.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }

}