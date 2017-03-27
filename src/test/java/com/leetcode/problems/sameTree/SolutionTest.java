package com.leetcode.problems.sameTree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void isSameTree() throws Exception {
        assertTrue(SOLUTION.isSameTree(null, null));
        assertFalse(SOLUTION.isSameTree(new TreeNode(1), null));
        assertFalse(SOLUTION.isSameTree(null, new TreeNode(1)));
        assertFalse(SOLUTION.isSameTree(new TreeNode(1), new TreeNode(1)));
        assertFalse(SOLUTION.isSameTree(
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(2, new TreeNode(1), new TreeNode(3))
        ));
    }

}