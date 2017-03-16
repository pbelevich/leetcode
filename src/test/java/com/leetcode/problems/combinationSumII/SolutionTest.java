package com.leetcode.problems.combinationSumII;

import org.junit.Test;

import java.util.List;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void combinationSum2() throws Exception {
        assertEquals(new int[][]{}, SOLUTION.combinationSum2(new int[]{}, 7));
        assertEquals(new int[][]{
                {1, 1, 6},
                {1, 2, 5},
                {1, 7},
                {2, 6},
                }, SOLUTION.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

    void assertEquals(int[][] expected, List<List<Integer>> actual) {
        if (expected == null) {
            if (actual == null) {
                return;
            }
            throw new AssertionError();
        }
        if (actual == null) {
            throw new AssertionError();
        }
        org.junit.Assert.assertEquals(expected.length, actual.size());

        for (int i = 0; i < expected.length; i++) {
            final int[] exp = expected[i];
            final List<Integer> act = actual.get(i);
            if (exp == null) {
                if (act == null) {
                    return;
                }
                throw new AssertionError();
            }
            if (act == null) {
                throw new AssertionError();
            }
            org.junit.Assert.assertEquals(exp.length, act.size());
            for (int j = 0; j < exp.length; j++) {
                org.junit.Assert.assertEquals((Integer) exp[j], act.get(j));
            }
        }
    }

}