package com.leetcode.problems.slidingWindowMedian;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void medianSlidingWindow() throws Exception {
        assertArrayEquals(new double[]{1, -1, -1, 3, 5, 6}, new Solution().medianSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3), 1e-9);
        assertArrayEquals(new double[]{2147483647.0}, new Solution().medianSlidingWindow(new int[]{2147483647, 2147483647}, 2), 1e-9);
    }

}