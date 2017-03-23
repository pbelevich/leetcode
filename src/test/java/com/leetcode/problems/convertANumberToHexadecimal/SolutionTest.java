package com.leetcode.problems.convertANumberToHexadecimal;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void toHex() throws Exception {
        assertEquals("0", new Solution().toHex(0));
        assertEquals("1", new Solution().toHex(1));
        assertEquals("9", new Solution().toHex(9));
        assertEquals("a", new Solution().toHex(10));
        assertEquals("f", new Solution().toHex(15));
        assertEquals("abcdef", new Solution().toHex(11259375));
        assertEquals("7fffffff", new Solution().toHex(Integer.MAX_VALUE));
        assertEquals("ffffffff", new Solution().toHex(-1));
        assertEquals("80000000", new Solution().toHex(Integer.MIN_VALUE));
    }

}