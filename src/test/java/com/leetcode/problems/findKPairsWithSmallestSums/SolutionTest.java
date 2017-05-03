package com.leetcode.problems.findKPairsWithSmallestSums;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void kSmallestPairs0() throws Exception {
        final List<int[]> actual = SOLUTION.kSmallestPairs(new int[]{}, new int[]{}, 5);
        assertEquals(0, actual.size());
    }

    @Test
    public void kSmallestPairs1() throws Exception {
        final List<int[]> actual = SOLUTION.kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3);
        assertEquals(3, actual.size());
        assertArrayEquals(new int[]{1, 2}, actual.get(0));
        assertArrayEquals(new int[]{1, 4}, actual.get(1));
        assertArrayEquals(new int[]{1, 6}, actual.get(2));
    }

    @Test
    public void kSmallestPairs2() throws Exception {
        final List<int[]> actual = SOLUTION.kSmallestPairs(new int[]{1, 1, 2}, new int[]{1, 2, 3}, 2);
        assertEquals(2, actual.size());
        assertArrayEquals(new int[]{1, 1}, actual.get(0));
        assertArrayEquals(new int[]{1, 1}, actual.get(1));
    }

    @Test
    public void kSmallestPairs3() throws Exception {
        final List<int[]> actual = SOLUTION.kSmallestPairs(new int[]{1, 2}, new int[]{3}, 3);
        assertEquals(2, actual.size());
        assertArrayEquals(new int[]{1, 3}, actual.get(0));
        assertArrayEquals(new int[]{2, 3}, actual.get(1));
    }

    @Test
    public void kSmallestPairs4() throws Exception {
        final List<int[]> actual = SOLUTION.kSmallestPairs(new int[]{1, 1, 2}, new int[]{1, 2, 3}, 10);
        actual.forEach(a -> System.out.println(Arrays.toString(a)));
        assertEquals(9, actual.size());
    }

}