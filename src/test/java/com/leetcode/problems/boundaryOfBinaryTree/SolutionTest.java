package com.leetcode.problems.boundaryOfBinaryTree;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void boundaryOfBinaryTree1() throws Exception {
        assertEquals(Arrays.asList(1, 3, 4, 2),
                new Solution().boundaryOfBinaryTree(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), new TreeNode(4)))));
    }

    @Test
    public void boundaryOfBinaryTree2() throws Exception {
        assertEquals(Arrays.asList(1, 2, 4, 7, 8, 9, 10, 6, 3),
                new Solution().boundaryOfBinaryTree(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(7), new TreeNode(8))), new TreeNode(3, new TreeNode(6, new TreeNode(9), new TreeNode(10)), null))));
    }

}