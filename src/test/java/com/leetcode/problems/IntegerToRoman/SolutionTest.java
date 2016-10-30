package com.leetcode.problems.IntegerToRoman;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testIntToRoman() throws Exception {
        assertEquals("I", SOLUTION.intToRoman(1));
        assertEquals("II", SOLUTION.intToRoman(2));
        assertEquals("III", SOLUTION.intToRoman(3));
        assertEquals("IV", SOLUTION.intToRoman(4));
        assertEquals("V", SOLUTION.intToRoman(5));
        assertEquals("VI", SOLUTION.intToRoman(6));
        assertEquals("VII", SOLUTION.intToRoman(7));
        assertEquals("VIII", SOLUTION.intToRoman(8));
        assertEquals("IX", SOLUTION.intToRoman(9));

        assertEquals("X", SOLUTION.intToRoman(10));
        assertEquals("XI", SOLUTION.intToRoman(11));
        assertEquals("XIX", SOLUTION.intToRoman(19));
        assertEquals("XX", SOLUTION.intToRoman(20));
        assertEquals("XXV", SOLUTION.intToRoman(25));
        assertEquals("XXIX", SOLUTION.intToRoman(29));
        assertEquals("XXX", SOLUTION.intToRoman(30));
        assertEquals("XXXIX", SOLUTION.intToRoman(39));
        assertEquals("XL", SOLUTION.intToRoman(40));
        assertEquals("XLV", SOLUTION.intToRoman(45));
        assertEquals("XLIX", SOLUTION.intToRoman(49));
        assertEquals("L", SOLUTION.intToRoman(50));
        assertEquals("LII", SOLUTION.intToRoman(52));
        assertEquals("LVIII", SOLUTION.intToRoman(58));
        assertEquals("LX", SOLUTION.intToRoman(60));
        assertEquals("LXXV", SOLUTION.intToRoman(75));
        assertEquals("LXXXIX", SOLUTION.intToRoman(89));
        assertEquals("XC", SOLUTION.intToRoman(90));
        assertEquals("XCIX", SOLUTION.intToRoman(99));

        assertEquals("C", SOLUTION.intToRoman(100));
        assertEquals("CXIX", SOLUTION.intToRoman(119));
        assertEquals("DCCCXC", SOLUTION.intToRoman(890));

        assertEquals("MD", SOLUTION.intToRoman(1500));
        assertEquals("MDCCC", SOLUTION.intToRoman(1800));
        assertEquals("MMMCMXCIX", SOLUTION.intToRoman(3999));
    }

}