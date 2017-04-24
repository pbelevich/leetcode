package com.leetcode.problems.binaryTreeVerticalOrderTraversal;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void verticalOrder() throws Exception {
        final List<List<Integer>> actual = new Solution().verticalOrder(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
    }

}