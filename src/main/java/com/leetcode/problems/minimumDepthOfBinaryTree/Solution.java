package com.leetcode.problems.minimumDepthOfBinaryTree;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/#/description
 * <p>
 * 111. Minimum Depth of Binary Tree
 * <p>
 * Given a binary tree, find its minimum depth.
 * <p>
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return minDepth2(root);
    }

    private int minDepth2(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            return 1 + Math.min(minDepth2(root.left), minDepth2(root.right));
        }
    }

}
