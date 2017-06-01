package com.leetcode.problems.shortestWordDistanceIII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void shortestWordDistance() throws Exception {
        assertEquals(3, SOLUTION.shortestWordDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "coding", "practice"));
        assertEquals(1, SOLUTION.shortestWordDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "makes", "coding"));
        assertEquals(3, SOLUTION.shortestWordDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "makes", "makes"));
    }

}