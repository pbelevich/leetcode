package com.leetcode.problems.sortList;

/**
 * https://leetcode.com/problems/sort-list/#/description
 * <p>
 * 148. Sort List
 * <p>
 * Sort a linked list in O(n log n) time using constant space complexity.
 *
 * @author Pavel Belevich
 */
public class Solution {

    private static final ListNode[] NULLS = {null, null};

    public ListNode sortList(ListNode head) {
        return sort(head)[0];
    }

    static ListNode[] sort(ListNode head) {
        if (head == null) {
            return NULLS;
        } else if (head.next == null) {
            return new ListNode[]{head, head};
        } else {
            ListNode pivot = head;

            ListNode lHead = null;
            ListNode lTail = null;
            ListNode rHead = null;
            ListNode rTail = null;

            for (ListNode curr = head.next; curr != null; ) {
                if (curr.val < pivot.val) {
                    if (lHead == null) {
                        lHead = curr;
                    }
                    if (lTail == null) {
                        lTail = curr;
                    } else {
                        lTail.next = curr;
                        lTail = curr;
                    }
                } else {
                    if (rHead == null) {
                        rHead = curr;
                    }
                    if (rTail == null) {
                        rTail = curr;
                    } else {
                        rTail.next = curr;
                        rTail = curr;
                    }
                }
                ListNode currNext = curr.next;
                curr.next = null;
                curr = currNext;
            }

            ListNode[] left = sort(lHead);
            lHead = left[0];
            lTail = left[1];

            ListNode[] right = sort(rHead);
            rHead = right[0];
            rTail = right[1];

            if (lTail != null) {
                lTail.next = pivot;
            }
            if (lHead == null) {
                lHead = pivot;
            }
            pivot.next = rHead;
            if (rTail == null) {
                rTail = pivot;
            }
            return new ListNode[]{lHead, rTail};
        }
    }

}
