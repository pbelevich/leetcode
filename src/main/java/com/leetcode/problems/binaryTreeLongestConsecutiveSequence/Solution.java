package com.leetcode.problems.binaryTreeLongestConsecutiveSequence;

/**
 * https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/#/description
 * <p>
 * 298. Binary Tree Longest Consecutive Sequence
 * <p>
 * Given a binary tree, find the length of the longest consecutive sequence path.
 * <p>
 * The path refers to any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The longest consecutive path need to be from parent to child (cannot be the reverse).
 * <p>
 * For example,
 * 1
 *  \
 *   3
 *  / \
 * 2   4
 *  \
 *   5
 * Longest consecutive sequence path is 3-4-5, so return 3.
 *   2
 *    \
 *     3
 *    /
 *   2
 *  /
 * 1
 * Longest consecutive sequence path is 2-3,not3-2-1, so return 2.
 *
 * @author Pavel Belevich
 */
public class Solution {

    private int max = 0;

    public int longestConsecutive(TreeNode root) {
        longestConsecutive2(root);
        return max;
    }

    private int longestConsecutive2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int result = 1;
        int lResult = longestConsecutive2(root.left);
        int rResult = longestConsecutive2(root.right);
        if (root.left != null && root.val + 1 == root.left.val) {
            result = 1 + lResult;
        }
        if (root.right != null && root.val + 1 == root.right.val) {
            result = Math.max(result, 1 + rResult);
        }
        max = Math.max(max, result);
        return result;
    }

}
