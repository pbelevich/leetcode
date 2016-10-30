package com.leetcode.problems.addTwoNumbers.iterative;

import com.leetcode.problems.addTwoNumbers.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int carry = 0;
        ListNode prev = result;
        do {
            if (l1 == null && carry == 0) {
                prev.next = l2;
                break;
            } else if (l2 == null && carry == 0) {
                prev.next = l1;
                break;
            } else {
                int sum = val(l1) + val(l2) + carry;
                prev.next = new ListNode(sum % 10);
                carry = sum / 10;
            }
            prev = prev.next;
            l1 = next(l1);
            l2 = next(l2);
        } while (l1 != null || l2 != null || carry != 0);
        return result.next;
    }

    private ListNode next(ListNode listNode) {
        return listNode != null ? listNode.next : null;
    }

    private int val(ListNode listNode) {
        return listNode != null ? listNode.val : 0;
    }

}