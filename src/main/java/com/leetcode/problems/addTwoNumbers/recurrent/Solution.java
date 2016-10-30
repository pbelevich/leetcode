package com.leetcode.problems.addTwoNumbers.recurrent;

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
        return addTwoNumbers(l1, l2, 0);
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        if (carry == 0) {
            if (l1 == null) {
                return l2;
            }
            if (l2 == null) {
                return l1;
            }
        }
        int sum = val(l1) + val(l2) + carry;
        ListNode result = new ListNode(sum % 10);
        result.next = addTwoNumbers(next(l1), next(l2), sum / 10);
        return result;
    }

    private ListNode next(ListNode listNode) {
        return listNode != null ? listNode.next : null;
    }

    private int val(ListNode listNode) {
        return listNode != null ? listNode.val : 0;
    }

}