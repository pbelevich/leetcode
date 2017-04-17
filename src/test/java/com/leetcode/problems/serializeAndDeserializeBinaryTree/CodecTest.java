package com.leetcode.problems.serializeAndDeserializeBinaryTree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class CodecTest {

    @Test
    public void serialize() throws Exception {
        final TreeNode expected = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, new TreeNode(5)), null), new TreeNode(3));
        final Codec codec = new Codec();
        final TreeNode actual = codec.deserialize(codec.serialize(expected));
        assertEquals(expected, actual);
    }

}