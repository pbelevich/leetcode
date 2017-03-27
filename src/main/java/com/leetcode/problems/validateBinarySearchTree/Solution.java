package com.leetcode.problems.validateBinarySearchTree;

/**
 * https://leetcode.com/problems/validate-binary-search-tree/#/description
 * <p>
 * 98. Validate Binary Search Tree
 * <p>
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * Assume a BST is defined as follows:
 * <p>
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * Example 1:
 *   2
 *  / \
 * 1   3
 * Binary tree [2,1,3], return true.
 * Example 2:
 *   1
 *  / \
 * 2   3
 * Binary tree [1,2,3], return false.
 *
 * @author Pavel Belevich
 */
public class Solution {

    static class State {

        final TreeNode root;
        Integer prev;

        public State(TreeNode root) {
            this.root = root;
        }

        boolean isValidBST() {
            return traverse(root);
        }

        boolean traverse(TreeNode root) {
            if (root != null) {
                if (!traverse(root.left)) {
                    return false;
                }
                if (prev == null) {
                    prev = root.val;
                } else if (prev >= root.val) {
                    return false;
                } else {
                    prev = root.val;
                }
                return traverse(root.right);
            }
            return true;
        }

    }

    public boolean isValidBST(TreeNode root) {
        return new State(root).isValidBST();
    }

}
