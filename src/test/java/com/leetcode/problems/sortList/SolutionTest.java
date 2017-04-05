package com.leetcode.problems.sortList;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void sortList() throws Exception {
        assertEquals(null, SOLUTION.sortList(null));
        assertEquals(new ListNode(42), SOLUTION.sortList(new ListNode(42)));
        assertEquals(new ListNode(24, new ListNode(42)), SOLUTION.sortList(new ListNode(24, new ListNode(42))));
        assertEquals(new ListNode(24, new ListNode(42)), SOLUTION.sortList(new ListNode(42, new ListNode(24))));
        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), SOLUTION.sortList(new ListNode(3, new ListNode(5, new ListNode(1, new ListNode(4, new ListNode(2)))))));
        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3))), SOLUTION.sortList(new ListNode(3, new ListNode(2, new ListNode(1)))));
    }

}