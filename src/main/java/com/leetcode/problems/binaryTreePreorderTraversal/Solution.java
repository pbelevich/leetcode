package com.leetcode.problems.binaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        final List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    void traverse(TreeNode root, List<Integer> result) {
        if (root != null) {
            result.add(root.val);
            traverse(root.left, result);
            traverse(root.right, result);
        }
    }

}
