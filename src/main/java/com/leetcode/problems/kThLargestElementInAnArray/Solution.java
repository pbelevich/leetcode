package com.leetcode.problems.kThLargestElementInAnArray;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/#/description
 * <p>
 * 215. Kth Largest Element in an Array
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k + 1);
        for (int i : nums) {
            queue.offer(i);

            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }

}
