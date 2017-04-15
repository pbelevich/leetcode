package com.leetcode.problems.constructBinaryTreeFromPreorderAndInorderTraversal;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/#/description
 * <p>
 * 105. Construct Binary Tree from Preorder and Inorder Traversal
 * <p>
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode buildTree(int[] preorder, int preLo, int preHi, int[] inorder, int inLo, int inHi) {
        final int length = preHi - preLo;
        if (length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preLo]);
        for (int i = inLo; i < inHi; i++) {
            if (inorder[i] == root.val) {
                final int len = i - inLo;
                root.left = buildTree(preorder, preLo + 1, preLo + 1 + len, inorder, inLo, i);
                root.right = buildTree(preorder, preLo + 1 + len, preHi, inorder, i + 1, inHi);
                return root;
            }
        }
        return root;
    }

}
