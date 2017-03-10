package com.leetcode.problems.recoverBinarySearchTree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void recoverTree() throws Exception {
        final TreeNode ethalon = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6, new TreeNode(5), new TreeNode(7)));

        TreeNode tree = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6, new TreeNode(5), new TreeNode(7)));
        new Solution().recoverTree(tree);
        assertEquals(ethalon, tree);


        tree = new TreeNode(3, new TreeNode(2, new TreeNode(1), new TreeNode(4)), new TreeNode(6, new TreeNode(5), new TreeNode(7)));
        new Solution().recoverTree(tree);
        assertEquals(ethalon, tree);

        tree = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(6)), new TreeNode(3, new TreeNode(5), new TreeNode(7)));
        new Solution().recoverTree(tree);
        assertEquals(ethalon, tree);
    }

}