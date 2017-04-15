package com.leetcode.problems.movingAverageFromDataStream;

/**
 * https://leetcode.com/problems/moving-average-from-data-stream/#/description
 * <p>
 * 346. Moving Average from Data Stream
 * <p>
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
 * <p>
 * For example,
 * MovingAverage m = new MovingAverage(3);
 * m.next(1) = 1
 * m.next(10) = (1 + 10) / 2
 * m.next(3) = (1 + 10 + 3) / 3
 * m.next(5) = (10 + 3 + 5) / 3
 *
 * @author Pavel Belevich
 */
public class MovingAverage {

    private int[] array;
    private int index;
    private int size;
    private double sum;

    public MovingAverage(int size) {
        this.array = new int[size];
        this.index = 0;
        this.size = 0;
    }

    public double next(int val) {
        sum -= array[index];
        sum += val;
        array[index++] = val;
        index %= array.length;
        size = Math.min(size + 1, array.length);
        return sum / size;
    }

}
