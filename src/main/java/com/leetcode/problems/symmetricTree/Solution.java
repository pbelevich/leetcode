package com.leetcode.problems.symmetricTree;

/**
 * https://leetcode.com/problems/symmetric-tree/#/description
 * <p>
 * 101. Symmetric Tree
 * <p>
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * <p>
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * <p>
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 *   1
 *  / \
 * 2   2
 *  \   \
 *  3    3
 *
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        return (left == null && right == null) ||
                (left != null && right != null && left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left));
    }

}
