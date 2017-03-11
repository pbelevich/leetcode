package com.leetcode.problems.binaryTreeLevelOrderTraversalII;

import java.util.*;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 * <p>
 * 107. Binary Tree Level Order Traversal II
 * <p>
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *    3
 *   / \
 *  9  20
 *    /  \
 *   15   7
 * return its bottom-up level order traversal as:
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);

        LinkedList<List<Integer>> result = new LinkedList<>();
        List<Integer> curr = new ArrayList<>();
        while (!queue.isEmpty()) {
            final TreeNode node = queue.poll();
            if (node == null) {
                result.addFirst(curr);
                curr = new ArrayList<>();
                if (!queue.isEmpty()) queue.offer(null);
            } else {
                curr.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }
        return result;
    }

}
