package com.leetcode.problems.sentenceScreenFitting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void wordsTyping1() throws Exception {
        assertEquals(1, SOLUTION.wordsTyping(new String[]{"hello", "world"}, 2, 8));
    }

    @Test
    public void wordsTyping2() throws Exception {
        assertEquals(2, SOLUTION.wordsTyping(new String[]{"a", "bcd", "e"}, 3, 6));
    }

    @Test
    public void wordsTyping3() throws Exception {
        assertEquals(1, SOLUTION.wordsTyping(new String[]{"I", "had", "apple", "pie"}, 4, 5));
    }

    @Test
    public void wordsTyping4() throws Exception {
        assertEquals(1, SOLUTION.wordsTyping(new String[]{"a", "b", "e"}, 20000, 20000));
    }

    @Test
    public void wordsTyping5() throws Exception {
        assertEquals(4, SOLUTION.wordsTyping(new String[]{"h"}, 2, 3));
    }

    @Test
    public void wordsTyping6() throws Exception {
        assertEquals(10, SOLUTION.wordsTyping(new String[]{"f", "p", "a"}, 8, 7));
    }

}