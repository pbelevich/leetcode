package com.leetcode.problems.convertSortedArrayToBinarySearchTree;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/#/description
 *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int lo, int hi) {
        final int length = hi - lo + 1;
        if (length == 0) {
            return null;
        } else if (length == 1) {
            return new TreeNode(nums[lo]);
        } else {
            final int mid = (lo + hi) >>> 1;
            final TreeNode treeNode = new TreeNode(nums[mid]);
            treeNode.left = sortedArrayToBST(nums, lo, mid - 1);
            treeNode.right = sortedArrayToBST(nums, mid + 1, hi);
            return treeNode;
        }
    }

}
