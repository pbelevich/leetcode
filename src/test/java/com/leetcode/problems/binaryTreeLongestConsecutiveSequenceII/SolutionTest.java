package com.leetcode.problems.binaryTreeLongestConsecutiveSequenceII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void longestConsecutive() throws Exception {
        assertEquals(2, SOLUTION.longestConsecutive(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        assertEquals(3, SOLUTION.longestConsecutive(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
    }

}