package com.leetcode.problems.simplifyPath;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void simplifyPath() throws Exception {
        assertEquals("/", SOLUTION.simplifyPath("/../"));
        assertEquals("/c", SOLUTION.simplifyPath("/a/./b/../../c/"));
        assertEquals("/home/foo", SOLUTION.simplifyPath("/home//foo/"));
        assertEquals("/", SOLUTION.simplifyPath("/.."));
    }

}