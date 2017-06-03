package com.leetcode.problems.convexPolygon;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void isConvex() throws Exception {
        assertTrue(SOLUTION.isConvex(Arrays.asList(
                Arrays.asList(0, 0),
                Arrays.asList(0, 1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 0)
        )));
    }

    @Test
    public void isNotConvex() throws Exception {
        assertFalse(SOLUTION.isConvex(Arrays.asList(
                Arrays.asList(0, 0),
                Arrays.asList(0, 10),
                Arrays.asList(10, 10),
                Arrays.asList(10, 0),
                Arrays.asList(5, 5)
        )));
    }

    @Test
    public void isNotConvex2() throws Exception {
        assertFalse(SOLUTION.isConvex(Arrays.asList(
                Arrays.asList(0, 0),
                Arrays.asList(0, 10),
                Arrays.asList(5, 5),
                Arrays.asList(10, 10),
                Arrays.asList(10, 0)
        )));
    }

    @Test
    public void isNotConvex3() throws Exception {
        assertFalse(SOLUTION.isConvex(Arrays.asList(
                Arrays.asList(0, 0),
                Arrays.asList(0, 1),
                Arrays.asList(1, 1),
                Arrays.asList(2, 1),
                Arrays.asList(2, 2),
                Arrays.asList(2, 3),
                Arrays.asList(3, 3),
                Arrays.asList(3, 0)
        )));
    }

}