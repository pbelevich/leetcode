package com.leetcode.problems.reverseLinkedListII;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii/
 *
 * 92. Reverse Linked List II
 *
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 *
 * For example:
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 *
 * return 1->4->3->2->5->NULL.
 *
 * Note:
 * Given m, n satisfy the following condition:
 * 1 ≤ m ≤ n ≤ length of list.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode last = dummy;
        for (int i = 0; i < n - m; i++) {
            last = last.next;
        }

        last = last.next;
        ListNode first = dummy;
        for (int i = 0; i < m - 1; i++) {
            last = last.next;
            first = first.next;
        }

        ListNode next;
        for (ListNode prev = last.next, i = first.next; prev != last; i = next) {
            next = i.next;
            i.next = prev;
            prev = i;
        }

        first.next = last;

        return dummy.next;
    }

}
