package com.leetcode.problems.balancedBinaryTree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void isBalanced() throws Exception {
        assertTrue(SOLUTION.isBalanced(null));
        assertTrue(SOLUTION.isBalanced(new TreeNode(1)));
        assertTrue(SOLUTION.isBalanced(new TreeNode(1, new TreeNode(2), null)));
        assertTrue(SOLUTION.isBalanced(new TreeNode(1, null, new TreeNode(2))));
        assertTrue(SOLUTION.isBalanced(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        assertFalse(SOLUTION.isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null)));
    }

}