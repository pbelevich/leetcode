package com.leetcode.problems.generalizedAbbreviation;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void generateAbbreviations() throws Exception {
        final List<String> actual = new Solution().generateAbbreviations("word");
    }

    @Test
    public void abbr() throws Exception {
        assertEquals("word", Solution.abbr("word".toCharArray(), 0));
        assertEquals("1ord", Solution.abbr("word".toCharArray(), 1));
        assertEquals("w1rd", Solution.abbr("word".toCharArray(), 2));
        assertEquals("2rd", Solution.abbr("word".toCharArray(), 3));
        assertEquals("wo1d", Solution.abbr("word".toCharArray(), 4));
        assertEquals("4", Solution.abbr("word".toCharArray(), 15));
    }

}