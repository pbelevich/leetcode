package com.leetcode.problems.mergeIntervals;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void merge() throws Exception {
        assertEquals(Arrays.asList(new Interval(1, 6), new Interval(8, 10), new Interval(15, 18)), SOLUTION.merge(Arrays.asList(new Interval(1, 3), new Interval(2, 6), new Interval(8, 10), new Interval(15, 18))));
    }

}