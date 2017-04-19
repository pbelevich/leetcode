package com.leetcode.problems.longestWordInDictionaryThroughDeleting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void findLongestWord() throws Exception {
        assertEquals("apple", SOLUTION.findLongestWord("abpcplea", Arrays.asList("ale", "apple", "monkey", "plea")));
        assertEquals("a", SOLUTION.findLongestWord("abpcplea", Arrays.asList("a", "b", "c")));
        assertEquals("ab", SOLUTION.findLongestWord("bab", Arrays.asList("ba","ab","a","b")));
    }

}