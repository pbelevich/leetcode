package com.leetcode.problems.binaryTreeRightSideView;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void rightSideView() throws Exception {
        assertEquals(Arrays.asList(1, 3, 7), SOLUTION.rightSideView(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)))));
    }

}