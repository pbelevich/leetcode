package com.leetcode.problems.removeDuplicatesFromSortedListII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void deleteDuplicates() throws Exception {
        assertEquals(null, new Solution().deleteDuplicates(null));
        assertEquals(new ListNode(1), new Solution().deleteDuplicates(new ListNode(1)));
        assertEquals(null, new Solution().deleteDuplicates(new ListNode(1, new ListNode(1))));
        assertEquals(new ListNode(2, new ListNode(4)), new Solution().deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(5))))))))));
    }

}