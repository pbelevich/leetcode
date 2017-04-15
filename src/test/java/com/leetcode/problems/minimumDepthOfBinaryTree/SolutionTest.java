package com.leetcode.problems.minimumDepthOfBinaryTree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void minDepthNull() throws Exception {
        assertEquals(0, SOLUTION.minDepth(null));
    }

    @Test
    public void minDepth() throws Exception {
        assertEquals(2, SOLUTION.minDepth(new TreeNode(1, new TreeNode(2), null)));
    }

}