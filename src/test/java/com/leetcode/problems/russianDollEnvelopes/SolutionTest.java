package com.leetcode.problems.russianDollEnvelopes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void maxEnvelopes() throws Exception {
        assertEquals(0, SOLUTION.maxEnvelopes(new int[][]{}));
        assertEquals(1, SOLUTION.maxEnvelopes(new int[][]{{1, 2}}));
        assertEquals(3, SOLUTION.maxEnvelopes(new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}}));
        assertEquals(3, SOLUTION.maxEnvelopes(new int[][]{{1, 3}, {3, 5}, {6, 7}, {6, 8}, {8, 4}, {9, 5}}));
        assertEquals(1, SOLUTION.maxEnvelopes(new int[][]{{1, 1}, {1, 1}, {1, 1}}));
        assertEquals(5, SOLUTION.maxEnvelopes(new int[][]{{2, 100}, {3, 200}, {4, 300}, {5, 500}, {5, 400}, {5, 250}, {6, 370}, {6, 360}, {7, 380}}));
    }

}
