package com.leetcode.problems.binaryTreeInorderTraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 *
 * 94. Binary Tree Inorder Traversal
 *
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * For example:
 * Given binary tree [1,null,2,3],
 * 1
 *  \
 *   2
 *  /
 * 3
 * return [1,3,2].
 *
 * Note: Recursive solution is trivial, could you do it iteratively?
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            Deque<TreeNode> stack = new ArrayDeque<>();
            TreeNode prev = null;
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode curr = stack.peek();
                if (prev == null || prev.left == curr || prev.right == curr) {
                    if (curr.left != null) stack.push(curr.left);
                } else if (curr == prev || curr.left == prev) {
                    result.add(stack.pop().val);
                    if (curr.right != null) stack.push(curr.right);
                }
                prev = curr;
            }
        }
        return result;
    }

}
