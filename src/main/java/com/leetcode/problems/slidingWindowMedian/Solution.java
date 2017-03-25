package com.leetcode.problems.slidingWindowMedian;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/sliding-window-median/#/description
 *
 * 480. Sliding Window Median
 *
 * Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.
 *
 * Examples:
 * [2,3,4] , the median is 3
 *
 * [2,3], the median is (2 + 3) / 2 = 2.5
 *
 * Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. Your job is to output the median array for each window in the original array.
 *
 * For example,
 * Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.
 *
 * Window position                Median
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       1
 * 1 [3  -1  -3] 5  3  6  7       -1
 * 1  3 [-1  -3  5] 3  6  7       -1
 * 1  3  -1 [-3  5  3] 6  7       3
 * 1  3  -1  -3 [5  3  6] 7       5
 * 1  3  -1  -3  5 [3  6  7]      6
 * Therefore, return the median sliding window as [1,-1,-1,3,5,6].
 *
 * Note:
 * You may assume k is always valid, ie: 1 ≤ k ≤ input array's size for non-empty array.
 *
 * @author Pavel Belevich
 */
public class Solution {

    private TreeMap<Integer, Integer> left = new TreeMap<>(Comparator.reverseOrder());
    private int leftSize;
    private TreeMap<Integer, Integer> right = new TreeMap<>();
    private int rightSize;

    public double[] medianSlidingWindow(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            insert(nums[i]);
        }
        final int n = nums.length - k + 1;
        double[] result = new double[n];
        result[0] = median();
        for (int i = 1; i < n; i++) {
            remove(nums[i - 1]);
            insert(nums[i + k - 1]);
            result[i] = median();
        }
        return result;
    }

    private void remove(int num) {
        if (!left.isEmpty() && num <= left.firstKey()) {
            left.computeIfPresent(num, (k, v) -> v > 1 ? v - 1 : null);
            leftSize--;
        } else if (!right.isEmpty() && num >= right.firstKey()) {
            right.computeIfPresent(num, (k, v) -> v > 1 ? v - 1 : null);
            rightSize--;
        }
        if (leftSize < rightSize) {
            Integer num1 = right.firstKey();
            right.computeIfPresent(num1, (k, v) -> v > 1 ? v - 1 : null);
            rightSize--;

            left.putIfAbsent(num1, 0);
            left.computeIfPresent(num1, (k, v) -> v + 1);
            leftSize++;
        }
        if (leftSize > rightSize + 1) {
            Integer num1 = left.firstKey();
            left.computeIfPresent(num1, (k, v) -> v > 1 ? v - 1 : null);
            leftSize--;

            right.putIfAbsent(num1, 0);
            right.computeIfPresent(num1, (k, v) -> v + 1);
            rightSize++;
        }
    }

    private void insert(int num) {
        if (leftSize == rightSize) {
            right.putIfAbsent(num, 0);
            right.computeIfPresent(num, (k, v) -> v + 1);

            Integer num1 = right.firstKey();
            right.computeIfPresent(num1, (k, v) -> v > 1 ? v - 1 : null);

            left.putIfAbsent(num1, 0);
            left.computeIfPresent(num1, (k, v) -> v + 1);
            leftSize++;
        } else {
            left.putIfAbsent(num, 0);
            left.computeIfPresent(num, (k, v) -> v + 1);

            Integer num1 = left.firstKey();
            left.computeIfPresent(num1, (k, v) -> v > 1 ? v - 1 : null);

            right.putIfAbsent(num1, 0);
            right.computeIfPresent(num1, (k, v) -> v + 1);
            rightSize++;
        }
    }

    private double median() {
        if (((leftSize + rightSize) & 1) == 0) {
            return ((long)left.firstKey() + (long)right.firstKey()) / 2.0;
        } else {
            return left.firstKey();
        }
    }

}
