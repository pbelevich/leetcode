package com.leetcode.problems.movingAverageFromDataStream;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class MovingAverageTest {

    private static final double DELTA = 1e-9;

    @Test
    public void next() throws Exception {
        final MovingAverage movingAverage = new MovingAverage(3);
        assertEquals(1d / 1, movingAverage.next(1), DELTA);
        assertEquals(11d / 2, movingAverage.next(10), DELTA);
        assertEquals(14d / 3, movingAverage.next(3), DELTA);
        assertEquals(18d / 3, movingAverage.next(5), DELTA);
    }

}