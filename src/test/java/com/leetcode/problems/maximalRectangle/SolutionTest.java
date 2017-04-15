package com.leetcode.problems.maximalRectangle;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void maximalRectangle0() throws Exception {
        assertEquals(0, SOLUTION.maximalRectangle(new char[][]{}));
    }

    @Test
    public void maximalRectangle1() throws Exception {
        assertEquals(6, SOLUTION.maximalRectangle(new char[][]{
                "10100".toCharArray(),
                "10111".toCharArray(),
                "11111".toCharArray(),
                "10010".toCharArray()
        }));
    }

}