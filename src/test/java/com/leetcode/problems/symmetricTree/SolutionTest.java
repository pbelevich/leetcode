package com.leetcode.problems.symmetricTree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void isSymmetric() throws Exception {
        assertTrue(SOLUTION.isSymmetric(null));
        assertTrue(SOLUTION.isSymmetric(new TreeNode(1)));
        assertTrue(SOLUTION.isSymmetric(new TreeNode(1, new TreeNode(2), new TreeNode(2))));
        assertFalse(SOLUTION.isSymmetric(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        assertFalse(SOLUTION.isSymmetric(new TreeNode(1, null, new TreeNode(3))));
        assertFalse(SOLUTION.isSymmetric(new TreeNode(1, new TreeNode(2), null)));
        assertTrue(SOLUTION.isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)))));
    }

}