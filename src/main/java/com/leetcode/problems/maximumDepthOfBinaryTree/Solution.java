package com.leetcode.problems.maximumDepthOfBinaryTree;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/#/description
 * <p>
 * 104. Maximum Depth of Binary Tree
 * <p>
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }

}
