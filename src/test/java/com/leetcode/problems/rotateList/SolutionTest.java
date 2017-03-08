package com.leetcode.problems.rotateList;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void rotateRight() throws Exception {
        assertEquals(null,
                SOLUTION.rotateRight(null, 1));

        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                SOLUTION.rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 0));

        assertEquals(new ListNode(5, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))),
                SOLUTION.rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 1));

        assertEquals(new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(2, new ListNode(3))))),
                SOLUTION.rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2));

        assertEquals(new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(2))))),
                SOLUTION.rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 3));

        assertEquals(new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(1))))),
                SOLUTION.rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 4));

        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                SOLUTION.rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 5));

        assertEquals(new ListNode(5, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))),
                SOLUTION.rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 6));
    }

}