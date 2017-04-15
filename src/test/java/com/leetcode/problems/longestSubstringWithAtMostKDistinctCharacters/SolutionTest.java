package com.leetcode.problems.longestSubstringWithAtMostKDistinctCharacters;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void lengthOfLongestSubstringKDistinct() throws Exception {
        assertEquals(3, SOLUTION.lengthOfLongestSubstringKDistinct("eceba", 2));
    }

}