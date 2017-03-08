package com.leetcode.problems.reverseNodesInKGroup;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public ListNode reverseKGroup(ListNode first, int k) {
        if (first == null) {
            return null;
        }
        if (first.next == null) {
            return first;
        }

        ListNode last = first;
        ListNode next = last.next;
        for (int i = 1; i < k; i++) {
            if (next == null) {
                first.next = null;
                return reverseKGroup(last, i);
            }
            ListNode prev = last;
            last = next;
            next = last.next;
            last.next =  prev;
        }
        first.next = reverseKGroup(next, k);
        return last;
    }

}
