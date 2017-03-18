package com.leetcode.problems.pathSumII;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * https://leetcode.com/problems/path-sum-ii/#/description
 * <p>
 * 113. Path Sum II
 * <p>
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 * <p>
 * For example:
 * Given the below binary tree and sum = 22,
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \    / \
 * 7    2  5   1
 * return
 * [
 * [5,4,11,2],
 * [5,8,4,5]
 * ]
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        pathSum(root, sum, result, stack);
        return result;
    }

    private void pathSum(TreeNode root, int sum, List<List<Integer>> result, Deque<Integer> stack) {
        if (root != null) {
            stack.addLast(root.val);
            if (sum == root.val && root.left == null && root.right == null) {
                result.add(new ArrayList<>(stack));
            } else {
                pathSum(root.left, sum - root.val, result, stack);
                pathSum(root.right, sum - root.val, result, stack);
            }
            stack.removeLast();
        }
    }

}
