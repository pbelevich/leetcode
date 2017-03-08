package com.leetcode.problems.copyListWithRandomPointer;

/**
 * https://leetcode.com/problems/copy-list-with-random-pointer/
 *
 * 138. Copy List with Random Pointer
 *
 * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
 *
 * Return a deep copy of the list.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }

        for (RandomListNode i = head; i != null; i = i.next.next) {
            RandomListNode next = i.next;
            RandomListNode j = new RandomListNode(i.label);
            i.next = j;
            j.next = next;
        }

        for (RandomListNode i = head; i != null; i = i.next.next) {
            RandomListNode j = i.next;
            if (i.random != null) {
                j.random = i.random.next;
            }
        }

        RandomListNode result = head.next;

        for (RandomListNode i = head; i != null; i = i.next) {
            RandomListNode j = i.next;
            i.next = j.next;
            if (j.next != null) {
                j.next = j.next.next;
            }
        }

        return result;
    }

}
