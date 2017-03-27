package com.leetcode.problems.uniqueBinarySearchTreesII;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/unique-binary-search-trees-ii/#/description
 * <p>
 * 95. Unique Binary Search Trees II
 * <p>
 * Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1...n.
 * <p>
 * For example,
 * Given n = 3, your program should return all 5 unique BST's shown below.
 * <p>
 * 1         3     3      2      1
 *  \       /     /      / \      \
 *   3     2     1      1   3      2
 *  /     /       \                 \
 * 2     1         2                 3
 *
 * @author Pavel Belevich
 */
public class Solution {

    private List<TreeNode>[][] dp;

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return Collections.emptyList();
        }
        dp = new List[n + 2][n + 2];
        for (int l = 0; l <= n; l++) {
            for (int lo = 1; lo + l <= n + 1; lo++) {
                int hi = lo + l;
                dp[lo][hi] = generateTrees(lo, hi);
            }
        }
        return dp[1][n + 1];
    }

    private List<TreeNode> generateTrees(int lo, int hi) {
        final int length = hi - lo;
        if (length == 0) {
            return Collections.singletonList(null);
        }
        if (length == 1) {
            return Collections.singletonList(new TreeNode(lo));
        }
        List<TreeNode> result = new ArrayList<>();
        for (int m = lo; m < hi; m++) {
            for (TreeNode left : dp[lo][m]) {
                for (TreeNode right : dp[m + 1][hi]) {
                    final TreeNode node = new TreeNode(m);
                    node.left = left;
                    node.right = right;
                    result.add(node);
                }
            }
        }
        return result;
    }

}
