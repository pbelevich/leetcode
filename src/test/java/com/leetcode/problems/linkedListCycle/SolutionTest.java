package com.leetcode.problems.linkedListCycle;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void hasCycle() throws Exception {
        assertFalse(SOLUTION.hasCycle(null));

        assertFalse(SOLUTION.hasCycle(new ListNode(1)));

        assertFalse(SOLUTION.hasCycle(new ListNode(1, new ListNode(2))));

        assertFalse(SOLUTION.hasCycle(new ListNode(1, new ListNode(2, new ListNode(3)))));

        ListNode cycle1 = new ListNode(1);
        cycle1.next = cycle1;
        assertTrue(SOLUTION.hasCycle(cycle1));

        ListNode cycle2 = new ListNode(1, new ListNode(2));
        cycle2.next = cycle2;
        assertTrue(SOLUTION.hasCycle(cycle2));



        ListNode cycle3 = new ListNode(1, new ListNode(2));
        cycle3.next.next = cycle3;
        assertTrue(SOLUTION.hasCycle(cycle3));

        ListNode cycle4 = new ListNode(1, new ListNode(2));
        cycle4.next.next = cycle4.next;
        assertTrue(SOLUTION.hasCycle(cycle4));



        ListNode cycle5 = new ListNode(1, new ListNode(2, new ListNode(3)));
        cycle5.next.next.next = cycle5;
        assertTrue(SOLUTION.hasCycle(cycle5));

        ListNode cycle6 = new ListNode(1, new ListNode(2, new ListNode(3)));
        cycle6.next.next.next = cycle6.next;
        assertTrue(SOLUTION.hasCycle(cycle6));

        ListNode cycle7 = new ListNode(1, new ListNode(2, new ListNode(3)));
        cycle7.next.next.next = cycle7.next.next;
        assertTrue(SOLUTION.hasCycle(cycle7));



        ListNode cycle8 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        cycle8.next.next.next.next = cycle8;
        assertTrue(SOLUTION.hasCycle(cycle8));

        ListNode cycle9 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        cycle9.next.next.next.next = cycle9.next;
        assertTrue(SOLUTION.hasCycle(cycle9));

        ListNode cycle10 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        cycle10.next.next.next.next = cycle10.next.next;
        assertTrue(SOLUTION.hasCycle(cycle10));

        ListNode cycle11 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        cycle11.next.next.next.next = cycle11.next.next.next;
        assertTrue(SOLUTION.hasCycle(cycle11));



        ListNode cycle12 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        cycle12.next.next.next.next.next = cycle12;
        assertTrue(SOLUTION.hasCycle(cycle12));

        ListNode cycle13 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        cycle13.next.next.next.next.next = cycle13.next;
        assertTrue(SOLUTION.hasCycle(cycle13));

        ListNode cycle14 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        cycle14.next.next.next.next.next = cycle14.next.next;
        assertTrue(SOLUTION.hasCycle(cycle14));

        ListNode cycle15 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        cycle15.next.next.next.next.next = cycle15.next.next.next;
        assertTrue(SOLUTION.hasCycle(cycle15));

        ListNode cycle16 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        cycle16.next.next.next.next.next = cycle16.next.next.next.next;
        assertTrue(SOLUTION.hasCycle(cycle16));
    }

}