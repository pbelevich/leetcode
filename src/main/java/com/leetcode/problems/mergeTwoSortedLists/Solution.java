package com.leetcode.problems.mergeTwoSortedLists;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            ListNode result;
            if (l1.val < l2.val) {
                result = l1;
                result.next = mergeTwoLists(l1.next, l2);
            } else {
                result = l2;
                result.next = mergeTwoLists(l1, l2.next);
            }
            return result;
        }
    }

}
