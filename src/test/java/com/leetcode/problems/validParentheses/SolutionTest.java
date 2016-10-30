package com.leetcode.problems.validParentheses;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void testIsValid() throws Exception {
        assertTrue(new Solution().isValid(""));
        assertFalse(new Solution().isValid("("));
        assertFalse(new Solution().isValid("]"));
        assertFalse(new Solution().isValid("}{"));
        assertTrue(new Solution().isValid("()[{}]"));
        assertFalse(new Solution().isValid("]]]"));
    }

}