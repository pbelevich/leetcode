package com.leetcode.problems.binaryTreeLevelOrderTraversalII;

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
    public void levelOrderBottom() throws Exception {
        assertEquals(Arrays.asList(
                Arrays.asList(15, 7),
                Arrays.asList(9, 20),
                Collections.singletonList(3)
        ), SOLUTION.levelOrderBottom(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }

}