package com.leetcode.problems.validateBinarySearchTree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void isValidBST() throws Exception {
        assertTrue(SOLUTION.isValidBST(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
        assertFalse(SOLUTION.isValidBST(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        assertFalse(SOLUTION.isValidBST(new TreeNode(5, new TreeNode(14, new TreeNode(1), null), null)));
    }

}