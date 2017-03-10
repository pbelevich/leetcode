package com.leetcode.problems.recoverBinarySearchTree;

/**
 * https://leetcode.com/problems/recover-binary-search-tree/
 *
 * 99. Recover Binary Search Tree
 *
 * Two elements of a binary search tree (BST) are swapped by mistake.
 *
 * Recover the tree without changing its structure.
 *
 * Note:
 A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
 *
 * @author Pavel Belevich
 */
public class Solution {

    private TreeNode first;
    private TreeNode second;
    private TreeNode prev;

    public void recoverTree(TreeNode root) {
        traverse(root);
        if (first != null) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }

    void traverse(TreeNode node) {
        if (node != null) {
            traverse(node.left);
            if (prev != null) {
                if (node.val < prev.val) {
                    if (first != null) {
                        second = node;
                    }
                    if (first == null) {
                        first = prev;
                        second = node;
                    }
                }
            }
            prev = node;
            traverse(node.right);
        }
    }

}
