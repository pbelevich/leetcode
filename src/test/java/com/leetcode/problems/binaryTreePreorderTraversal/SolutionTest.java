package com.leetcode.problems.binaryTreePreorderTraversal;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void preorderTraversal() throws Exception {
        assertEquals(Arrays.asList(1, 2, 3), SOLUTION.preorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))));
    }

}