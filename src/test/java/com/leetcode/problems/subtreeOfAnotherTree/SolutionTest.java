package com.leetcode.problems.subtreeOfAnotherTree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void isSubtree1() throws Exception {
        assertTrue(SOLUTION.isSubtree(new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5)), new TreeNode(4, new TreeNode(1), new TreeNode(2))));
    }

    @Test
    public void isSubtree2() throws Exception {
        assertFalse(SOLUTION.isSubtree(new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2, new TreeNode(0), null)), new TreeNode(5)), new TreeNode(4, new TreeNode(1), new TreeNode(2))));
    }

    @Test
    public void isSubtree3() throws Exception {
        assertTrue(SOLUTION.isSubtree(new TreeNode(1, new TreeNode(1), null), new TreeNode(1)));
    }

}