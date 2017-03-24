package com.leetcode.problems.deleteNodeInABST;

import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void deleteNode() throws Exception {
        assertEquals(null, SOLUTION.deleteNode(null, 0));
        assertEquals(null, SOLUTION.deleteNode(new TreeNode(0), 0));
        assertEquals(new TreeNode(2, null, new TreeNode(3)), SOLUTION.deleteNode(new TreeNode(2, new TreeNode(1), new TreeNode(3)), 1));
        assertEquals(new TreeNode(2, new TreeNode(1), null), SOLUTION.deleteNode(new TreeNode(2, new TreeNode(1), new TreeNode(3)), 3));
        assertEquals(new TreeNode(3, new TreeNode(1), null), SOLUTION.deleteNode(new TreeNode(2, new TreeNode(1), new TreeNode(3)), 2));
        assertEquals(new TreeNode(6, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(7)), SOLUTION.deleteNode(new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(6, null, new TreeNode(7))), 5));
    }

    @Test
    public void deleteNodeBig() throws Exception {
        SOLUTION.deleteNode(deserialize(new StringReader("[2,0,33,null,1,25,40,null,null,11,31,34,45,10,18,29,32,null,36,43,46,4,null,12,24,26,30,null,null,35,39,42,44,null,48,3,9,null,14,22,null,null,27,null,null,null,null,38,null,41,null,null,null,47,49,null,null,5,null,13,15,21,23,null,28,37,null,null,null,null,null,null,null,null,8,null,null,null,17,19,null,null,null,null,null,null,null,7,null,16,null,null,20,6]")), 33);
    }

    TreeNode deserialize(Reader reader) {
        Scanner scanner = new Scanner(reader).useDelimiter("[,\\[\\]]");
        if (scanner.hasNext()) {
            Queue<TreeNode> queue = new ArrayDeque<>();
            final TreeNode root = new TreeNode(Integer.valueOf(scanner.next()));
            queue.offer(root);
            while (scanner.hasNext()) {
                final TreeNode node = queue.poll();
                if (scanner.hasNext()) {
                    final TreeNode left = node(scanner.next());
                    node.left = left;
                    if (left != null) {
                        queue.offer(left);
                    }
                }
                if (scanner.hasNext()) {
                    final TreeNode right = node(scanner.next());
                    node.right = right;
                    if (right != null) {
                        queue.offer(right);
                    }
                }
            }
            return root;
        }
        return null;
    }

    TreeNode node(String s) {
        if (s == null || "null".equals(s)) {
            return null;
        } else {
            return new TreeNode(Integer.valueOf(s));
        }
    }

}
