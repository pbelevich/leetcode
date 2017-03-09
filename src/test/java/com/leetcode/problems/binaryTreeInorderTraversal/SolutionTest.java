package com.leetcode.problems.binaryTreeInorderTraversal;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void inorderTraversal() throws Exception {
        assertEquals(Collections.emptyList(), SOLUTION.inorderTraversal(null));
        assertEquals(Arrays.asList(1, 3, 2), SOLUTION.inorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))));
        assertEquals(Arrays.asList(2, 1, 3), SOLUTION.inorderTraversal(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        assertEquals(Arrays.asList(4, 2, 5, 1, 6, 3, 7), SOLUTION.inorderTraversal(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)))));
    }

}