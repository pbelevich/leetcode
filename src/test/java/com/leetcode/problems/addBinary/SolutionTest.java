package com.leetcode.problems.addBinary;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void addBinary() throws Exception {
        assertEquals("0",SOLUTION.addBinary("0", "0"));
        assertEquals("1",SOLUTION.addBinary("0", "1"));
        assertEquals("1",SOLUTION.addBinary("1", "0"));
        assertEquals("10",SOLUTION.addBinary("1", "1"));
        assertEquals("10101101010",SOLUTION.addBinary("1111001101", "110011101"));
    }

}