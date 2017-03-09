package com.leetcode.problems.oddEvenLinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void oddEvenList() throws Exception {
        assertEquals(null, SOLUTION.oddEvenList(null));
        assertEquals(new ListNode(42), SOLUTION.oddEvenList(new ListNode(42)));
        assertEquals(new ListNode(43), SOLUTION.oddEvenList(new ListNode(43)));
        assertEquals(new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(2, new ListNode(4))))), SOLUTION.oddEvenList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))));
        assertEquals(new ListNode(1, new ListNode(3, new ListNode(2, new ListNode(4)))), SOLUTION.oddEvenList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))));
    }

}