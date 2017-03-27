package com.leetcode.problems.uniqueBinarySearchTrees;

/**
 * https://leetcode.com/problems/unique-binary-search-trees/#/description
 * <p>
 * 96. Unique Binary Search Trees
 * <p>
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 * <p>
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
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

//    /**
//     * Recursive
//     */
//    public int numTrees(int n) {
//        if (n < 2) {
//            return 1;
//        }
//        int result = 0;
//        for (int i = 0; i < n; i++) {
//            int left = i;
//            int right = n - left - 1;
//            result += numTrees(left) * numTrees(right);
//        }
//        return result;
//    }

//    /**
//     * DP
//     */
//    public int numTrees(int n) {
//        if (n < 2) {
//            return 1;
//        }
//        int[] dp = new int[n + 1];
//        dp[0] = dp[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            for (int j = 0; j < i; j++) {
//                dp[i] += dp[j] * dp[i - j - 1];
//            }
//        }
//        return dp[n];
//    }

    /**
     *             (2n)!      (1 * 2 * 3 * ... * n-1 * n * n+1) * (n+2 * ... * 2n-1 * 2n)   n+2 * n+3 * ... * n+n
     * C(n) = ------------- = ----------------------------------------------------------- = ---------------------
     *        (n + 1)! * n!   (1 * 2 * 3 * ... * n-1 * n * n+1) * (2 * 3 * ... * n-1 * n)     2 *   3 * ... *   n
     */
    public int numTrees(int n) {
        if (n < 2) {
            return 1;
        }
        long result = 1L;
        for (int i = 2; i <= n; i++) {
            result *= (n + i);
            result /= (i - 1);
        }
        if (n != 0) {
            result /= n;
        }
        return (int) result;
    }

}
