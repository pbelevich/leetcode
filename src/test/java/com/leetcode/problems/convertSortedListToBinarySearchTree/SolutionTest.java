package com.leetcode.problems.convertSortedListToBinarySearchTree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void sortedListToBST() throws Exception {
        assertEquals(null, SOLUTION.sortedListToBST(null));
        assertEquals(new TreeNode(1), SOLUTION.sortedListToBST(new ListNode(1)));
        assertEquals(new TreeNode(2, new TreeNode(1), new TreeNode(3)), SOLUTION.sortedListToBST(new ListNode(1, new ListNode(2, new ListNode(3)))));
    }

}