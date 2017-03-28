package com.leetcode.problems.linkedListCycle;

/**
 * https://leetcode.com/problems/linked-list-cycle/#/description
 * <p>
 * 141. Linked List Cycle
 * <p>
 * Given a linked list, determine if it has a cycle in it.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode first;
        ListNode second;
        for (first = head, second = head.next;
             second != null && first != second;
             first = first.next, second = second.next != null ? second.next.next : null);
        return first == second;
    }

}
