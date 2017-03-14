package com.leetcode.problems.nonOverlappingIntervals;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void eraseOverlapIntervals() throws Exception {
        assertEquals(0, SOLUTION.eraseOverlapIntervals(null));
        assertEquals(0, SOLUTION.eraseOverlapIntervals(new Interval[0]));
        assertEquals(0, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(1, 2)}));
        assertEquals(1, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(1, 2), new Interval(1, 2)}));
        assertEquals(1, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(1, 3), new Interval(2, 4)}));
        assertEquals(1, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(2, 4), new Interval(1, 3)}));
        assertEquals(1, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(1, 6), new Interval(2, 3), new Interval(4, 5)}));
        assertEquals(1, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(1, 6), new Interval(4, 5), new Interval(2, 3)}));
        assertEquals(1, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(4, 5), new Interval(1, 6), new Interval(2, 3)}));
        assertEquals(1, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(4, 5), new Interval(2, 3), new Interval(1, 6)}));
        assertEquals(1, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(2, 3), new Interval(4, 5), new Interval(1, 6)}));
        assertEquals(1, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(2, 3), new Interval(1, 6), new Interval(4, 5)}));
        assertEquals(2, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(1, 6), new Interval(2, 4), new Interval(3, 5)}));
        assertEquals(2, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(1, 6), new Interval(3, 5), new Interval(2, 4)}));
        assertEquals(2, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(3, 5), new Interval(1, 6), new Interval(2, 4)}));
        assertEquals(2, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(3, 5), new Interval(2, 4), new Interval(1, 6)}));
        assertEquals(2, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(2, 4), new Interval(3, 5), new Interval(1, 6)}));
        assertEquals(2, SOLUTION.eraseOverlapIntervals(new Interval[] {new Interval(2, 4), new Interval(1, 6), new Interval(3, 5)}));
    }

}