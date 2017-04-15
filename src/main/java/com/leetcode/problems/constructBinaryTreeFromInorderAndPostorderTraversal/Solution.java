package com.leetcode.problems.constructBinaryTreeFromInorderAndPostorderTraversal;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/#/description
 * <p>
 * 106. Construct Binary Tree from Inorder and Postorder Traversal
 * <p>
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    private TreeNode buildTree(int[] inorder, int inLo, int inHi, int[] postorder, int postLo, int postHi) {
        if (inHi - inLo == 0 || postHi - postLo == 0) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postHi - 1]);
        for (int i = inLo; i < inHi; i++) {
            if (inorder[i] == root.val) {
                final int len = i - inLo;
                root.left = buildTree(inorder, inLo, i, postorder, postLo, postLo + len);
                root.right = buildTree(inorder, i + 1, inHi, postorder, postLo + len, postHi - 1);
                return root;
            }
        }
        return root;
    }

}
