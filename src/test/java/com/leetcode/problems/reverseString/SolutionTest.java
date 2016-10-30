package com.leetcode.problems.reverseString;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void reverseString() throws Exception {
        assertEquals("olleh", new Solution().reverseString("hello"));
    }

}