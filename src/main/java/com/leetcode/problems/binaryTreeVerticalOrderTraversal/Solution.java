package com.leetcode.problems.binaryTreeVerticalOrderTraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/binary-tree-vertical-order-traversal/#/description
 * <p>
 * 314. Binary Tree Vertical Order Traversal
 *
 * @author Pavel Belevich
 */
public class Solution {

    static class TreeNodeWrapper {

        final TreeNode treeNode;
        final int i;

        public TreeNodeWrapper(TreeNode treeNode, int i) {
            this.treeNode = treeNode;
            this.i = i;
        }

    }

    private SortedMap<Integer, List<Integer>> map = new TreeMap<>();

    public List<List<Integer>> verticalOrder(TreeNode root) {
        if (root != null) {
            final ArrayDeque<TreeNodeWrapper> queue = new ArrayDeque<>();
            queue.offer(new TreeNodeWrapper(root, 0));
            while (!queue.isEmpty()) {
                final TreeNodeWrapper wrapper = queue.poll();
                final List<Integer> list = map.computeIfAbsent(wrapper.i, j -> new ArrayList<>());
                list.add(wrapper.treeNode.val);
                if (wrapper.treeNode.left != null) {
                    queue.offer(new TreeNodeWrapper(wrapper.treeNode.left, wrapper.i - 1));
                }
                if (wrapper.treeNode.right != null) {
                    queue.offer(new TreeNodeWrapper(wrapper.treeNode.right, wrapper.i + 1));
                }
            }
        }
        return new ArrayList<>(map.values());
    }

}
