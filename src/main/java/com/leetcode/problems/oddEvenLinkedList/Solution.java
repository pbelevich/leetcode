package com.leetcode.problems.oddEvenLinkedList;

/**
 * https://leetcode.com/problems/odd-even-linked-list/
 * <p>
 * 328. Odd Even Linked List
 * <p>
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
 * <p>
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 * <p>
 * Example:
 * Given 1->2->3->4->5->NULL,
 * return 1->3->5->2->4->NULL.
 * <p>
 * Note:
 * The relative order inside both the even and odd groups should remain as it was in the input.
 * The first node is considered odd, the second node even and so on ...
 *
 * @author Pavel Belevich
 */
public class Solution {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode l = dummy;
        int i = 0;
        for (ListNode r = dummy; r != null && r.next != null; r = r.next, i++) {
            if ((i & 1) == 0) {
                if (r != l) {
                    move(r, l);
                    i++;
                }
                l = l.next;
            }
        }
        return dummy.next;
    }

    static void move(ListNode i, ListNode j) {
        ListNode node = i.next;
        i.next = i.next.next;
        node.next = j.next;
        j.next = node;
    }

}
