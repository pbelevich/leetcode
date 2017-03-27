package com.leetcode.problems.insertionSortList;

/**
 * https://leetcode.com/problems/insertion-sort-list/#/description
 *
 * 147. Insertion Sort List
 *
 * Sort a linked list using insertion sort.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public ListNode insertionSortList(ListNode head) {
        ListNode hat = new ListNode(Integer.MIN_VALUE);
        hat.next = head;
        for (ListNode i = hat; i.next != null;) {
            if (i.next.val < i.val) {
                ListNode h = i.next;
                i.next = h.next;
                for (ListNode j = hat; j.next != null; j = j.next) {
                    if (j.next.val >= h.val) {
                        h.next = j.next;
                        j.next = h;
                        break;
                    }
                }
            } else {
                i = i.next;
            }
        }
        return hat.next;
    }

}
