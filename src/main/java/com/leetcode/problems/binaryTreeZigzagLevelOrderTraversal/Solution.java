package com.leetcode.problems.binaryTreeZigzagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/#/description
 * <p>
 * 103. Binary Tree Zigzag Level Order Traversal
 * <p>
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *   3
 *  / \
 * 9  20
 *   /  \
 *  15   7
 * return its zigzag level order traversal as:
 * [
 * [3],
 * [20,9],
 * [15,7]
 * ]
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        boolean reversed = false;

        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> curr = new LinkedList<>();
        while (!queue.isEmpty()) {
            final TreeNode node = queue.poll();
            if (node == null) {
                result.add(curr);
                curr = new LinkedList<>();
                if (!queue.isEmpty()) queue.offer(null);
                reversed = !reversed;
            } else {
                if (reversed) {
                    curr.addFirst(node.val);
                } else {
                    curr.addLast(node.val);
                }
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }
        return result;
    }

}
