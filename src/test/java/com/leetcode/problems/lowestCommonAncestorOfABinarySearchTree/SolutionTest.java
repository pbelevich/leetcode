package com.leetcode.problems.lowestCommonAncestorOfABinarySearchTree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testLowestCommonAncestor() throws Exception {
        assertEquals(6, solution.lowestCommonAncestor(n(6, n(2, n(0), n(4, n(3), n(5))), n(8, n(7), n(9))), n(2), n(8)).val);
        assertEquals(2, solution.lowestCommonAncestor(n(6, n(2, n(0), n(4, n(3), n(5))), n(8, n(7), n(9))), n(2), n(4)).val);
    }

    static TreeNode n(int val, TreeNode left, TreeNode right) {
        final TreeNode treeNode = new TreeNode(val);
        treeNode.left = left;
        treeNode.right = right;
        return treeNode;
    }

    static TreeNode n(int val) {
        return new TreeNode(val);
    }

}