package com.leetcode.problems.slidingWindowMaximum;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int[] maxNumbers = new int[k > 0 ? nums.length - k + 1 : 0];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.getLast()]) {
                deque.removeLast(); //Drop all prev less then current
            }
            deque.addLast(i); //Add current to the end
            if (i >= k && !deque.isEmpty() && deque.getFirst() == i - k) {
                deque.removeFirst(); //Drop max if it's on beyond the k
            }
            if (i >= k - 1) {
                maxNumbers[j++] = nums[deque.getFirst()];
            }
        }

        return maxNumbers;
    }

}
