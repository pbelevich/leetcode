package com.leetcode.problems.shuffleAnArray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});

    @Test
    public void testShuffle() throws Exception {
        SOLUTION.shuffle();
    }

}