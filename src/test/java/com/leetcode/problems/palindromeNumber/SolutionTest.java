package com.leetcode.problems.palindromeNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testIsPalindrome() throws Exception {
        assertEquals(true, SOLUTION.isPalindrome(1));
        assertEquals(true, SOLUTION.isPalindrome(11));
        assertEquals(true, SOLUTION.isPalindrome(111));
        assertEquals(true, SOLUTION.isPalindrome(1221));
        assertEquals(true, SOLUTION.isPalindrome(12321));
        assertEquals(false, SOLUTION.isPalindrome(12));
        assertEquals(false, SOLUTION.isPalindrome(12231));
        assertEquals(false, SOLUTION.isPalindrome(10));
        assertEquals(false, SOLUTION.isPalindrome(1122));
        assertEquals(true, SOLUTION.isPalindrome(1000000001));
    }

}