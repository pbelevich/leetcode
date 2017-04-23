package com.leetcode.problems.rangeAddition;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void getModifiedArray() throws Exception {
        assertArrayEquals(new int[]{-2, 0, 3, 5, 3}, SOLUTION.getModifiedArray(5, new int[][]{
                {1, 3, 2},
                {2, 4, 3},
                {0, 2, -2}
        }));
    }

}