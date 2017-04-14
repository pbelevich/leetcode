package com.leetcode.problems.balancedBinaryTree;

/**
 * https://leetcode.com/problems/balanced-binary-tree/#/description
 * <p>
 * Given a binary tree, determine if it is height-balanced.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isBalanced(TreeNode root) {
        return height(root) != null;
    }

    private Integer height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            Integer lh = height(root.left);
            if (lh == null) {
                return null;
            }
            Integer rh = height(root.right);
            if (rh == null) {
                return null;
            }
            if (Math.abs(lh - rh) > 1) {
                return null;
            }
            return 1 + Math.max(lh, rh);
        }
    }

}
