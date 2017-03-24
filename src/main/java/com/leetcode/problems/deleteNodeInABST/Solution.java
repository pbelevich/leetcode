package com.leetcode.problems.deleteNodeInABST;

/**
 * https://leetcode.com/problems/delete-node-in-a-bst/#/description
 * <p>
 * 450. Delete Node in a BST
 * <p>
 * Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
 * <p>
 * Basically, the deletion can be divided into two stages:
 * <p>
 * Search for a node to remove.
 * If the node is found, delete the node.
 * Note: Time complexity should be O(height of tree).
 * <p>
 * Example:
 * <p>
 * root = [5,3,6,2,4,null,7]
 * key = 3
 * <p>
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 * <p>
 * Given key to delete is 3. So we find the node with value 3 and delete it.
 * <p>
 * One valid answer is [5,4,6,2,null,null,7], shown in the following BST.
 * <p>
 *     5
 *    / \
 *   4   6
 *  /     \
 * 2       7
 * <p>
 * Another valid answer is [5,2,6,null,4,null,7].
 * <p>
 *    5
 *   / \
 *  2   6
 *   \   \
 *   4   7
 *
 * @author Pavel Belevich
 */
public class Solution {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
            return root;
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
            return root;
        } else {
            TreeNode left = root.left;
            TreeNode right = root.right;
            if (left == null) {
                return right;
            } else if (right == null) {
                return left;
            } else {
                TreeNode[] nodes = deleteMostLeft(right);
                right = nodes[0];
                TreeNode mostLeft = nodes[1];
                mostLeft.left = left;
                mostLeft.right = right;
                return mostLeft;
            }
        }
    }

    private TreeNode[] deleteMostLeft(TreeNode root) {
        final TreeNode[] result = new TreeNode[2];
        TreeNode mostLeft;
        TreeNode parent;
        for (mostLeft = root, parent = null; mostLeft.left != null; parent = mostLeft, mostLeft = mostLeft.left) ;
        if (parent != null) {
            parent.left = mostLeft.right;
        }
        if (mostLeft == root) {
            root = root.right;
        }
        result[0] = root;
        result[1] = mostLeft;
        return result;
    }

}
