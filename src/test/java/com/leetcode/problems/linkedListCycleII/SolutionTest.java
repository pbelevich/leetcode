package com.leetcode.problems.linkedListCycleII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void detectCycle() throws Exception {
        assertNull(null, SOLUTION.detectCycle(null));

        assertNull(null, SOLUTION.detectCycle(new ListNode(1)));

        assertNull(null, SOLUTION.detectCycle(new ListNode(1, new ListNode(2))));

        assertNull(null, (SOLUTION.detectCycle(new ListNode(1, new ListNode(2, new ListNode(3))))));

        ListNode cycle1 = new ListNode(1);
        cycle1.next = cycle1;
        assertEquals(cycle1, SOLUTION.detectCycle(cycle1));

        ListNode cycle2 = new ListNode(1, new ListNode(2));
        cycle2.next = cycle2;
        assertEquals(cycle2, SOLUTION.detectCycle(cycle2));



        ListNode cycle3 = new ListNode(1, new ListNode(2));
        cycle3.next.next = cycle3;
        assertEquals(cycle3, SOLUTION.detectCycle(cycle3));

        ListNode cycle4 = new ListNode(1, new ListNode(2));
        cycle4.next.next = cycle4.next;
        assertEquals(cycle4.next, SOLUTION.detectCycle(cycle4));



        ListNode cycle5 = new ListNode(1, new ListNode(2, new ListNode(3)));
        cycle5.next.next.next = cycle5;
        assertEquals(cycle5, SOLUTION.detectCycle(cycle5));

        ListNode cycle6 = new ListNode(1, new ListNode(2, new ListNode(3)));
        cycle6.next.next.next = cycle6.next;
        assertEquals(cycle6.next, SOLUTION.detectCycle(cycle6));

        ListNode cycle7 = new ListNode(1, new ListNode(2, new ListNode(3)));
        cycle7.next.next.next = cycle7.next.next;
        assertEquals(cycle7.next.next, SOLUTION.detectCycle(cycle7));



        ListNode cycle8 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        cycle8.next.next.next.next = cycle8;
        assertEquals(cycle8, SOLUTION.detectCycle(cycle8));

        ListNode cycle9 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        cycle9.next.next.next.next = cycle9.next;
        assertEquals(cycle9.next, SOLUTION.detectCycle(cycle9));

        ListNode cycle10 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        cycle10.next.next.next.next = cycle10.next.next;
        assertEquals(cycle10.next.next, SOLUTION.detectCycle(cycle10));

        ListNode cycle11 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        cycle11.next.next.next.next = cycle11.next.next.next;
        assertEquals(cycle11.next.next.next, SOLUTION.detectCycle(cycle11));



        ListNode cycle12 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        cycle12.next.next.next.next.next = cycle12;
        assertEquals(cycle12, SOLUTION.detectCycle(cycle12));

        ListNode cycle13 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        cycle13.next.next.next.next.next = cycle13.next;
        assertEquals(cycle13.next, SOLUTION.detectCycle(cycle13));

        ListNode cycle14 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        cycle14.next.next.next.next.next = cycle14.next.next;
        assertEquals(cycle14.next.next, SOLUTION.detectCycle(cycle14));

        ListNode cycle15 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        cycle15.next.next.next.next.next = cycle15.next.next.next;
        assertEquals(cycle15.next.next.next, SOLUTION.detectCycle(cycle15));

        ListNode cycle16 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        cycle16.next.next.next.next.next = cycle16.next.next.next.next;
        assertEquals(cycle16.next.next.next.next, SOLUTION.detectCycle(cycle16));
    }

}