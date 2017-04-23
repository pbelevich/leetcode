package com.leetcode.problems.binaryTreeLongestConsecutiveSequenceII;

/**
 * https://leetcode.com/problems/binary-tree-longest-consecutive-sequence-ii/#/description
 * <p>
 * 549. Binary Tree Longest Consecutive Sequence II
 *
 * @author Pavel Belevich
 */
public class Solution {

    private int max = 0;

    public int longestConsecutive(TreeNode root) {
        longestConsecutive2(root);
        return max;
    }

    private long longestConsecutive2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int inc = 1;
        int dec = 1;
        long lResult = longestConsecutive2(root.left);
        int lInc = (int) (lResult);
        int lDec = (int) (lResult >> Integer.SIZE);
        long rResult = longestConsecutive2(root.right);
        int rInc = (int) (rResult);
        int rDec = (int) (rResult >> Integer.SIZE);
        int max1 = 1;
        int max2 = 1;
        if (root.left != null && root.val + 1 == root.left.val) {
            inc = 1 + lInc;
            max1 += lInc;
        }
        if (root.left != null && root.val - 1 == root.left.val) {
            dec = Math.max(dec, 1 + lDec);
            max2 += lDec;
        }
        if (root.right != null && root.val + 1 == root.right.val) {
            inc = Math.max(inc, 1 + rInc);
            max2 += rInc;
        }
        if (root.right != null && root.val - 1 == root.right.val) {
            dec = Math.max(dec, 1 + rDec);
            max1 += rDec;
        }
        max = Math.max(max, Math.max(max1, max2));
        return (((long) inc) & 0xffffffffL) | (((long) dec) << Integer.SIZE);
    }

}
