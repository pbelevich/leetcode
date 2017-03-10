package com.leetcode.problems.binaryTreePreorderTraversal;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 * <p>
 * 144. Binary Tree Preorder Traversal
 * <p>
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * <p>
 * For example:
 * Given binary tree {1,#,2,3},
 * 1
 *  \
 *   2
 *  /
 * 3
 * return [1,2,3].
 * <p>
 * Note: Recursive solution is trivial, could you do it iteratively?
 *
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void preorderTraversal() throws Exception {
        assertEquals(Collections.emptyList(), SOLUTION.preorderTraversal(null));
        assertEquals(Arrays.asList(1, 2, 3), SOLUTION.preorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))));
        assertEquals(Arrays.asList(1, 2, 4, 5, 3, 6, 7), SOLUTION.preorderTraversal(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)))));
    }

}