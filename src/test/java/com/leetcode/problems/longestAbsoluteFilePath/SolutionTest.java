package com.leetcode.problems.longestAbsoluteFilePath;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void lengthLongestPath1() throws Exception {
        assertEquals(32, SOLUTION.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));
    }

    @Test
    public void lengthLongestPath2() throws Exception {
        assertEquals(12, SOLUTION.lengthLongestPath("dir\n    file.txt"));
    }

    @Test
    public void lengthLongestPath3() throws Exception {
        assertEquals(16, SOLUTION.lengthLongestPath("dir\n        file.txt"));
    }

}