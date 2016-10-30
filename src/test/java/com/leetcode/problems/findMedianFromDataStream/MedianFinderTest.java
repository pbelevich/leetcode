package com.leetcode.problems.findMedianFromDataStream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Pavel Belevich
 */
public class MedianFinderTest {

    public static final double DELTA = 1e-9;

    @Test
    public void test() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        assertEquals(1.0, medianFinder.findMedian(), DELTA);
        medianFinder.addNum(2);
        assertEquals(1.5, medianFinder.findMedian(), DELTA);
        medianFinder.addNum(3);
        assertEquals(2.0, medianFinder.findMedian(), DELTA);
        medianFinder.addNum(4);
        assertEquals(2.5, medianFinder.findMedian(), DELTA);
    }

    @Test
    public void test1() {
        MedianFinder medianFinder = new MedianFinder();

        medianFinder.addNum(-1);
        assertEquals(-1.0, medianFinder.findMedian(), DELTA);

        medianFinder.addNum(-2);
        assertEquals(-1.5, medianFinder.findMedian(), DELTA);

        medianFinder.addNum(-3);
        assertEquals(-2.0, medianFinder.findMedian(), DELTA);

        medianFinder.addNum(-4);
        assertEquals(-2.5, medianFinder.findMedian(), DELTA);

        medianFinder.addNum(-5);
        assertEquals(-3.0, medianFinder.findMedian(), DELTA);
    }

}