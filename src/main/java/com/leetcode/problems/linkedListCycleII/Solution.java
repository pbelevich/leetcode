package com.leetcode.problems.linkedListCycleII;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii/#/description
 *
 * 142. Linked List Cycle II
 *
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode first;
        ListNode second;
        for (first = head, second = head.next;
             second != null && first != second;
             first = first.next, second = second.next != null ? second.next.next : null);
        if (first != second) {
            return null;
        }
        int length = 1;
        for (second = second.next; second != first; second = second.next) {
            length++;
        }
        second = head;
        for (int i = 0; i < length; i++) {
            second = second.next;
        }
        first = head;
        while (first != second) {
            first = first.next;
            second = second.next;
        }
        return first;
    }

}
