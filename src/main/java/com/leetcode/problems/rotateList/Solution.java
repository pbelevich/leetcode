package com.leetcode.problems.rotateList;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head;
        for (int i = 0; i < k; i++) {
            if (first.next != null) {
                first = first.next;
            } else {
                return rotateRight(head, k % (i + 1));
            }
        }
        if (first == head) {
            return head;
        }
        ListNode prev;
        ListNode second;
        for (prev = head, second = head.next; first.next != null; prev = second, second = second.next, first = first.next);
        prev.next = null;
        first.next = head;
        return second;
    }

}
