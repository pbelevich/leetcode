package com.leetcode.problems.medianOfTwoSortedArrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Pavel Belevich
 */
public abstract class AbstractSolutionTest {

    private static final double DELTA = 1e-9;
    private final SolutionAdapter solution;

    public AbstractSolutionTest(SolutionAdapter solution) {
        this.solution = solution;
    }

    @Test
    public void findMedianSortedArrays() throws Exception {
        assertEquals(42.0, solution.findMedianSortedArrays(new int[] {42}, new int[] {}), DELTA);
        assertEquals(42.0, solution.findMedianSortedArrays(new int[] {}, new int[] {42}), DELTA);
        assertEquals(1.5, solution.findMedianSortedArrays(new int[] {1}, new int[] {2}), DELTA);
        assertEquals(3.0, solution.findMedianSortedArrays(new int[] {1, 2, 3}, new int[] {4, 5}), DELTA);
        assertEquals(3.0, solution.findMedianSortedArrays(new int[] {4, 5}, new int[] {1, 2, 3}), DELTA);
        assertEquals(3.0, solution.findMedianSortedArrays(new int[] {2, 4}, new int[] {1, 3, 5}), DELTA);
        assertEquals(5.0, solution.findMedianSortedArrays(new int[] {1}, new int[] {2, 3, 4, 5, 6, 7, 8, 9}), DELTA);
    }

}