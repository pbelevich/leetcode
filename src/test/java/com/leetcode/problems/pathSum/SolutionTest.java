package com.leetcode.problems.pathSum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void hasPathSum() throws Exception {
        assertFalse(SOLUTION.hasPathSum(null, 0));
        assertFalse(SOLUTION.hasPathSum(new TreeNode(5), 22));
        assertFalse(SOLUTION.hasPathSum(new TreeNode(1, new TreeNode(2), null), 1));
        assertTrue(SOLUTION.hasPathSum(new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1)))), 22));
        assertTrue(SOLUTION.hasPathSum(new TreeNode(-2, null, new TreeNode(-3)), -5));
        assertTrue(SOLUTION.hasPathSum(new TreeNode(1, new TreeNode(-2, new TreeNode(1, new TreeNode(-1), null), new TreeNode(3)), new TreeNode(-3, new TreeNode(-2), null)), -1));
    }

}