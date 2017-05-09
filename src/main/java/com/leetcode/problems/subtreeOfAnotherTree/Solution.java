package com.leetcode.problems.subtreeOfAnotherTree;

/**
 * https://leetcode.com/problems/subtree-of-another-tree/#/description
 * <p>
 * 572. Subtree of Another Tree
 *
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        } else if (s.val == t.val) {
            return equal(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
        } else {
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }
    }

    private boolean equal(TreeNode s, TreeNode t) {
        return (s == null && t == null) || (s != null && t != null && s.val == t.val && equal(s.left, t.left) && equal(s.right, t.right));
    }

}
