package com.leetcode.problems.mergeKSortedLists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        ListNode min = null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparing(node -> node.val));
        queue.addAll(Arrays.stream(lists).filter(Objects::nonNull).collect(Collectors.toList()));
        while (!queue.isEmpty()) {
            if (min == null) {
                min = queue.poll();
                result = min;
            } else {
                min.next = queue.poll();
                min = min.next;
            }
            if (min.next != null) {
                queue.offer(min.next);
            }
        }
        return result;
    }

}
