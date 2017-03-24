package com.leetcode.problems.minimumMovesToEquaArrayElements;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void minMoves() throws Exception {
        assertEquals(3, SOLUTION.minMoves(new int[]{1, 2, 3}));
    }

}