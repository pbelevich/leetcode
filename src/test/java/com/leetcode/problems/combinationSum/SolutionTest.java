package com.leetcode.problems.combinationSum;

import org.junit.Test;

import java.util.List;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void combinationSum() throws Exception {
        assertEquals(new int[][]{}, SOLUTION.combinationSum(new int[]{}, 7));
        assertEquals(new int[][]{{2, 2, 3}, {7}}, SOLUTION.combinationSum(new int[]{2, 3, 6, 7}, 7));
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