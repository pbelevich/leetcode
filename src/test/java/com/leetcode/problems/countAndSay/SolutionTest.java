package com.leetcode.problems.countAndSay;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void countAndSay() throws Exception {
        assertEquals("1", SOLUTION.countAndSay(1));
        assertEquals("11", SOLUTION.countAndSay(2));
        assertEquals("21", SOLUTION.countAndSay(3));
        assertEquals("1211", SOLUTION.countAndSay(4));
        assertEquals("111221", SOLUTION.countAndSay(5));
        assertEquals("312211", SOLUTION.countAndSay(6));
    }

}