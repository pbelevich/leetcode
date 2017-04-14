package com.leetcode.problems.convertSortedArrayToBinarySearchTree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void sortedArrayToBST() throws Exception {
        assertEquals(null, SOLUTION.sortedArrayToBST(new int[]{}));
        assertEquals(new TreeNode(1), SOLUTION.sortedArrayToBST(new int[]{1}));
        assertEquals(new TreeNode(2, new TreeNode(1), new TreeNode(3)), SOLUTION.sortedArrayToBST(new int[]{1, 2, 3}));
    }

}