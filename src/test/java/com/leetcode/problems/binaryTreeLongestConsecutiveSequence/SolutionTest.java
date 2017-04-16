package com.leetcode.problems.binaryTreeLongestConsecutiveSequence;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void longestConsecutive() throws Exception {
        assertEquals(3, new Solution().longestConsecutive(new TreeNode(1, null, new TreeNode(3, new TreeNode(2), new TreeNode(4, null, new TreeNode(5))))));
    }

}