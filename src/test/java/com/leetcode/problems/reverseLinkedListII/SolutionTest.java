package com.leetcode.problems.reverseLinkedListII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void reverseBetween() throws Exception {
        assertEquals(new ListNode(1),
                SOLUTION.reverseBetween(new ListNode(1), 1, 1));

        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                SOLUTION.reverseBetween(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 1, 1));

        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                SOLUTION.reverseBetween(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 3, 3));

        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                SOLUTION.reverseBetween(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 5, 5));

        assertEquals(new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5))))),
                SOLUTION.reverseBetween(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2, 4));

        assertEquals(new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1, new ListNode(5))))),
                SOLUTION.reverseBetween(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 1, 4));

        assertEquals(new ListNode(1, new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2))))),
                SOLUTION.reverseBetween(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2, 5));
    }

}