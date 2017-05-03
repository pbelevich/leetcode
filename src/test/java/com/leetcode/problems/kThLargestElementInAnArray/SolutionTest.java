package com.leetcode.problems.kThLargestElementInAnArray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void findKthLargest() throws Exception {
        assertEquals(5, new Solution().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

}