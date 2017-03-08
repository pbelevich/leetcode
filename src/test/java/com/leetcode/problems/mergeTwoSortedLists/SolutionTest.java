package com.leetcode.problems.mergeTwoSortedLists;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void mergeTwoLists() throws Exception {
        assertEquals(null, SOLUTION.mergeTwoLists(null, null));
        assertEquals(new ListNode(1), SOLUTION.mergeTwoLists(new ListNode(1), null));
        assertEquals(new ListNode(2), SOLUTION.mergeTwoLists(null, new ListNode(2)));
        assertEquals(new ListNode(1, new ListNode(2)), SOLUTION.mergeTwoLists(new ListNode(1), new ListNode(2)));
        assertEquals(new ListNode(1, new ListNode(2)), SOLUTION.mergeTwoLists(new ListNode(2), new ListNode(1)));
    }

}