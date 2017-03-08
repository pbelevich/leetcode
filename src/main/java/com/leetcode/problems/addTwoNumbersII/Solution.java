package com.leetcode.problems.addTwoNumbersII;

/**
 * https://leetcode.com/problems/add-two-numbers-ii/
 *
 * 445. Add Two Numbers II
 *
 * You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Follow up:
 * What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
 *
 * Example:
 *
 * Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 8 -> 0 -> 7
 *
 * @author Pavel Belevich
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int size1 = size(l1);
        int size2 = size(l2);
        int diff = size1 - size2;
        if (size1 < size2) {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
            diff = -diff;
        }
        for (int i = 0; i < diff + 1; i++) {
            ListNode newL2 = new ListNode(0);
            newL2.next = l2;
            l2 = newL2;
        }
        ListNode newL1 = new ListNode(0);
        newL1.next = l1;
        l1 = newL1;
        ListNode result = addTwoNumbersSimple(l1, l2);
        if (result.val == 0) {
            result = result.next;
        }
        return result;
    }

    static ListNode addTwoNumbersSimple(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return null;
        }
        ListNode next = addTwoNumbersSimple(l1.next, l2.next);
        int carry = 0;
        if (next != null) {
            carry = next.val / 10;
            next.val = next.val % 10;
        }
        ListNode result = new ListNode(l1.val + l2.val + carry);
        result.next = next;
        return result;
    }

    static int size(ListNode listNode) {
        int size = 0;
        for (ListNode i = listNode; i != null; i = i.next) {
            size++;
        }
        return size;
    }

}
