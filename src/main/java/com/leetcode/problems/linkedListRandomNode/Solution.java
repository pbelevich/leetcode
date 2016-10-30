package com.leetcode.problems.linkedListRandomNode;

public class Solution {

    private final ListNode head;
    private final int size;

    public Solution(ListNode head) {
        this.head = head;
        int size = 0;
        for (ListNode curr = this.head; curr != null; curr = curr.next) {
            size++;
        }
        this.size = size;
    }

    public int getRandom() {
        int n = (int) (Math.random() * this.size);
        ListNode curr = this.head;
        for (int i = 0; i < n; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

}