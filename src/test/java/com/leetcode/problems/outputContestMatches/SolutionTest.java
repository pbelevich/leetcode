package com.leetcode.problems.outputContestMatches;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void findContestMatch() throws Exception {
        assertEquals("(1,2)", SOLUTION.findContestMatch(2));
        assertEquals("(((1,8),(4,5)),((2,7),(3,6)))", SOLUTION.findContestMatch(8));
    }

}