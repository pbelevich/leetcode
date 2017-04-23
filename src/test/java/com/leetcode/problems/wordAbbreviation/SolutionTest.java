package com.leetcode.problems.wordAbbreviation;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void wordsAbbreviation() throws Exception {
        assertEquals(Arrays.asList("l2e","god","internal","me","i6t","interval","inte4n","f2e","intr4n"),
                SOLUTION.wordsAbbreviation(Arrays.asList("like", "god", "internal", "me", "internet", "interval", "intension", "face", "intrusion")));
    }

    @Test
    public void abbr() throws Exception {
        assertEquals("a", Solution.abbr("a", 1));
        assertEquals("ab", Solution.abbr("ab", 1));
        assertEquals("abc", Solution.abbr("abc", 1));
        assertEquals("a2d", Solution.abbr("abcd", 1));
        assertEquals("abcd", Solution.abbr("abcd", 2));
        assertEquals("a3e", Solution.abbr("abcde", 1));
        assertEquals("ab2e", Solution.abbr("abcde", 2));
    }

}