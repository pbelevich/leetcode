package com.leetcode.problems.constructBinaryTreeFromInorderAndPostorderTraversal;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void buildTree() throws Exception {
        assertEquals(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7))),
                SOLUTION.buildTree(new int[]{4, 2, 5, 1, 6, 3, 7}, new int[]{4, 5, 2, 6, 7, 3, 1}));
    }

    @Test
    public void buildTree2() throws Exception {
        assertEquals(new TreeNode(1, new TreeNode(2), null),
                SOLUTION.buildTree(new int[]{2, 1}, new int[]{2, 1}));
    }

    @Test
    public void buildTree3() throws Exception {
        assertEquals(new TreeNode(2, new TreeNode(1), new TreeNode(6, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5))), null)),
                SOLUTION.buildTree(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 5, 4, 3, 6, 2}));
    }

}