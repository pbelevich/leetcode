package com.leetcode.problems.removeNthNodeFromEndOfList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;

        ListNode first;
        int i;
        for (i = 0, first = head; first != null && i < n; first = first.next, i++);

        ListNode second;
        for (second = preHead; first != null; first = first.next, second = second.next);

        second.next = second.next.next;

        return preHead.next;
    }

}