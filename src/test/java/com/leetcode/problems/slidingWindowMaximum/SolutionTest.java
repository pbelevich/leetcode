package com.leetcode.problems.slidingWindowMaximum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void testMaxSlidingWindow() throws Exception {
        assertArrayEquals(new int[]{}, new Solution().maxSlidingWindow(new int[]{}, 0));
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, new Solution().maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
        assertArrayEquals(new int[]{10, 9, 8, 7, 6, 5, 4, 3}, new Solution().maxSlidingWindow(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 3));
    }

}