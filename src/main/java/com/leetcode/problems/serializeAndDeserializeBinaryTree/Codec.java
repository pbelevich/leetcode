package com.leetcode.problems.serializeAndDeserializeBinaryTree;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/serialize-and-deserialize-binary-tree/#/description
 *
 * 297. Serialize and Deserialize Binary Tree
 *
 * @author Pavel Belevich
 */
public class Codec {

    private static final String X = "X";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }

    private void serialize(TreeNode root, StringBuilder sb) {
        if (sb.length() != 0) {
            sb.append(",");
        }
        if (root == null) {
            sb.append(X);
        } else {
            sb.append(root.val);
            serialize(root.left, sb);
            serialize(root.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return deserialize(new Scanner(data).useDelimiter(","));
    }

    private TreeNode deserialize(Scanner scanner) {
        if (scanner.hasNext()) {
            final String node = scanner.next();
            if (X.equals(node)) {
                return null;
            } else {
                final TreeNode treeNode = new TreeNode(Integer.valueOf(node));
                treeNode.left = deserialize(scanner);
                treeNode.right = deserialize(scanner);
                return treeNode;
            }
        }
        return null;
    }

}
