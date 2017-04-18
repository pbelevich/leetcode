package com.leetcode.problems.perfectSquares;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void numSquares() throws Exception {
        assertEquals(3, new Solution().numSquares(12));
        assertEquals(2, new Solution().numSquares(13));
    }

}