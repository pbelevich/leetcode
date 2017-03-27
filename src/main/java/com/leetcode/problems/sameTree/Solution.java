package com.leetcode.problems.sameTree;

/**
 * https://leetcode.com/problems/same-tree/#/description
 * <p>
 * 100. Same Tree
 * <p>
 * Given two binary trees, write a function to check if they are equal or not.
 * <p>
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return p == null && q == null || (p != null && q != null && p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }

}
