package com.leetcode.problems.findAllDuplicatesInAnArray;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void findDuplicates() throws Exception {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        assertEquals(Arrays.asList(2, 3), SOLUTION.findDuplicates(nums));
    }

}