package com.leetcode.problems.missingNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void missingNumber() throws Exception {
        assertEquals(1, new Solution().missingNumber(new int[]{0}));
        assertEquals(0, new Solution().missingNumber(new int[]{1}));
        assertEquals(0, new Solution().missingNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        assertEquals(1, new Solution().missingNumber(new int[]{0, 2, 3, 4, 5, 6, 7, 8, 9}));
        assertEquals(2, new Solution().missingNumber(new int[]{0, 1, 3, 4, 5, 6, 7, 8, 9}));
        assertEquals(9, new Solution().missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(8, new Solution().missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}));
    }

}