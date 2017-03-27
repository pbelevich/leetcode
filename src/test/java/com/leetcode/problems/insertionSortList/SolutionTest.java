package com.leetcode.problems.insertionSortList;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void insertionSortList() throws Exception {
        assertEquals(null, SOLUTION.insertionSortList(null));
        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3))), SOLUTION.insertionSortList(new ListNode(1, new ListNode(2, new ListNode(3)))));
        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3))), SOLUTION.insertionSortList(new ListNode(2, new ListNode(1, new ListNode(3)))));
        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3))), SOLUTION.insertionSortList(new ListNode(3, new ListNode(2, new ListNode(1)))));
        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3))), SOLUTION.insertionSortList(new ListNode(2, new ListNode(3, new ListNode(1)))));
        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3))), SOLUTION.insertionSortList(new ListNode(3, new ListNode(1, new ListNode(2)))));
    }

}