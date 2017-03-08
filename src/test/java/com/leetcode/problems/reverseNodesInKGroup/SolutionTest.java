package com.leetcode.problems.reverseNodesInKGroup;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void reverse() throws Exception {
        assertEquals(null, SOLUTION.reverseKGroup(null, 3));

        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                SOLUTION.reverseKGroup(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 1));

        assertEquals(new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(5))))),
                SOLUTION.reverseKGroup(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2));

        assertEquals(new ListNode(3, new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(5))))),
                SOLUTION.reverseKGroup(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 3));

        assertEquals(new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1, new ListNode(5))))),
                SOLUTION.reverseKGroup(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 4));

        assertEquals(new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1))))),
                SOLUTION.reverseKGroup(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 5));
    }

}