package com.leetcode.problems.rangeSumQuery2DMutable;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class NumMatrixTest {
    @Test
    public void sumRegion() throws Exception {
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

}