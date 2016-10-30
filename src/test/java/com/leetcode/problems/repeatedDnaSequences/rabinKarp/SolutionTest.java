package com.leetcode.problems.repeatedDnaSequences.rabinKarp;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testHash() {
        assertEquals(739168, Solution.hash("ACGTAAGCTCACTGAAA".toCharArray(), 4, 14));
    }

    @Test
    public void testDecode() {
        assertEquals("AAGCTCACTG", Solution.decode(739168, 10));
    }

    @Test
    public void testHashShiftRight() {
        assertEquals(971224, Solution.hashShiftRight(739168, 10, 'T'));
    }

    @Test
    public void testFindRepeatedDnaSequences() {
        assertEquals(Collections.emptyList(), SOLUTION.findRepeatedDnaSequences(""));
        assertEquals(Arrays.asList("AAAAACCCCC", "CCCCCAAAAA"), SOLUTION.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        assertEquals(Arrays.asList("AAAAAAAAAA"), SOLUTION.findRepeatedDnaSequences("AAAAAAAAAAA"));
        assertEquals(Arrays.asList("AAAAAAAAAA"), SOLUTION.findRepeatedDnaSequences("AAAAAAAAAAAA"));
    }

}