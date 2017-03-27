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

    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n + 1);
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
            for (TreeNode left : generateTrees(lo, m)) {
                for (TreeNode right : generateTrees(m + 1, hi)) {
                    result.add(new TreeNode(m, left, right));
                }
            }
        }
        return result;
    }

}
