package com.leetcode.problems.topKFrequentElements;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void test() {
        assertEquals(Arrays.asList(1, 2), Solution.topKFrequent(new int[] {1,1,1,2,2,3}, 2));
    }

}