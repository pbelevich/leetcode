package com.leetcode.problems.rangeSumQuery2DMutable;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class NumMatrixTest {

    @Test
    public void sumRegion1() throws Exception {
        final NumMatrix numMatrix = new NumMatrix(new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        });
        assertEquals(8, numMatrix.sumRegion(2, 1, 4, 3));
        numMatrix.update(3, 2, 2);
        assertEquals(10, numMatrix.sumRegion(2, 1, 4, 3));
    }

    @Test
    public void sumRegion2() throws Exception {
        final NumMatrix numMatrix = new NumMatrix(new int[][]{
                {1, 2}
        });
        assertEquals(1, numMatrix.sumRegion(0, 0, 0, 0));
        assertEquals(2, numMatrix.sumRegion(0, 1, 0, 1));
        assertEquals(3, numMatrix.sumRegion(0, 0, 0, 1));
        numMatrix.update(0, 0, 3);
        numMatrix.update(0, 1, 5);
        assertEquals(8, numMatrix.sumRegion(0, 0, 0, 1));
    }

}