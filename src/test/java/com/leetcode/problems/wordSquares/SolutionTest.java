package com.leetcode.problems.wordSquares;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void wordSquares1() throws Exception {
        final List<List<String>> actual = new Solution().wordSquares(new String[]{"area", "lead", "wall", "lady", "ball"});
    }

    @Test
    public void wordSquares2() throws Exception {
        final List<List<String>> actual = new Solution().wordSquares(new String[]{"momy", "oooo", "yoyo"});
    }

}