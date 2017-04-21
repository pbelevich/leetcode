package com.leetcode.problems.rangeSumQueryMutable;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class NumArrayTest {

    @Test
    public void sumRange() throws Exception {
        final NumArray numArray = new NumArray(new int[]{1, 3, 5});
        assertEquals(9, numArray.sumRange(0, 2));
        numArray.update(1, 2);
        assertEquals(8, numArray.sumRange(0, 2));
    }

}