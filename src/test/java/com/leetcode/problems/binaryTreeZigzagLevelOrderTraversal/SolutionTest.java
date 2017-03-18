package com.leetcode.problems.binaryTreeZigzagLevelOrderTraversal;

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
    public void zigzagLevelOrder() throws Exception {
        assertEquals(Arrays.asList(
                Collections.singletonList(1),
                Arrays.asList(3, 2),
                Arrays.asList(4, 5, 6, 7)
                ), SOLUTION.zigzagLevelOrder(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)))));
    }

}