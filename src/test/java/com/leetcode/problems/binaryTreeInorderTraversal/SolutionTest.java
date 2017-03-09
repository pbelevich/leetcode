package com.leetcode.problems.binaryTreeInorderTraversal;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void inorderTraversal() throws Exception {
        assertEquals(Arrays.asList(1, 3, 2), new Solution().inorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))));
    }

}