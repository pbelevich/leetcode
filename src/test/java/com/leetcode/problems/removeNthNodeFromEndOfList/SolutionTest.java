package com.leetcode.problems.removeNthNodeFromEndOfList;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testRemoveNthFromEnd() throws Exception {
        assertEquals(n(1, n(2, n(3, n(4)))), SOLUTION.removeNthFromEnd(n(1, n(2, n(3, n(4, n(5))))), 1));
        assertEquals(n(1, n(2, n(3, n(5)))), SOLUTION.removeNthFromEnd(n(1, n(2, n(3, n(4, n(5))))), 2));
        assertEquals(n(1, n(2, n(4, n(5)))), SOLUTION.removeNthFromEnd(n(1, n(2, n(3, n(4, n(5))))), 3));
        assertEquals(n(1, n(3, n(4, n(5)))), SOLUTION.removeNthFromEnd(n(1, n(2, n(3, n(4, n(5))))), 4));
        assertEquals(n(2, n(3, n(4, n(5)))), SOLUTION.removeNthFromEnd(n(1, n(2, n(3, n(4, n(5))))), 5));
    }

    static ListNode n(int value, ListNode next) {
        ListNode listNode = new ListNode(value);
        listNode.next = next;
        return listNode;
    }

    static ListNode n(int value) {
        return n(value, null);
    }

}