package com.leetcode.problems.removeDuplicatesFromSortedListII;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode first = null;
        int counter = 0;
        for (ListNode i = head; i != null; i = i.next) {
            if (counter != 0 && first.val == i.val) {
                counter++;
            } else {
                if (counter == 1) {
                    curr.next = first;
                    curr = curr.next;
                }
                first = i;
                counter = 1;
            }
        }
        if (counter == 1) {
            curr.next = first;
        } else {
            curr.next = null;
        }
        return dummy.next;
    }

}
