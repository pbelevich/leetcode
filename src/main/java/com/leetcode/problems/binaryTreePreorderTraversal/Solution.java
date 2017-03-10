package com.leetcode.problems.binaryTreePreorderTraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        final List<Integer> result = new ArrayList<>();

        if (root != null) {
            Deque<TreeNode> stack = new ArrayDeque<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                final TreeNode node = stack.pop();
                result.add(node.val);
                if (node.right != null) stack.push(node.right);
                if (node.left != null) stack.push(node.left);
            }
        }

        return result;
    }

}
