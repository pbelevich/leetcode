package com.leetcode.problems.letterCombinationsOfAPhoneNumber;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void letterCombinations() throws Exception {
        assertEquals(new String[] {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}, SOLUTION.letterCombinations("23"));
    }

    void assertEquals(String[] expected, List<String> actualList) {
        final String[] actual = actualList.toArray(new String[actualList.size()]);
        Arrays.sort(actual);
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);
    }

}