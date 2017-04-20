package com.leetcode.problems.rangeSumQueryImmutable;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class NumArrayTest {

    @Test
    public void sumRange() throws Exception {
        final NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(1, numArray.sumRange(0, 2));
        assertEquals(-1, numArray.sumRange(2, 5));
        assertEquals(-3, numArray.sumRange(0, 5));
    }

}