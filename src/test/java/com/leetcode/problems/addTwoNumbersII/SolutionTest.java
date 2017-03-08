package com.leetcode.problems.addTwoNumbersII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void addTwoNumbers() throws Exception {
        assertEquals(new ListNode(7, new ListNode(8, new ListNode(0, new ListNode(7)))),
                SOLUTION.addTwoNumbers(new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3)))), new ListNode(5, new ListNode(6, new ListNode(4)))));
    }

}