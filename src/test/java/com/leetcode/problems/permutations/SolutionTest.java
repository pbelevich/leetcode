package com.leetcode.problems.permutations;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void permute() throws Exception {
        SOLUTION.permute(new int[] {1, 2, 3});
    }

}