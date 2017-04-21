package com.leetcode.problems.rangeSumQueryMutable;

/**
 * https://leetcode.com/problems/range-sum-query-mutable/#/description
 * <p>
 * 307. Range Sum Query - Mutable
 * <p>
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 * <p>
 * The update(i, val) function modifies nums by updating the element at index i to val.
 * Example:
 * Given nums = [1, 3, 5]
 * <p>
 * sumRange(0, 2) -> 9
 * update(1, 2)
 * sumRange(0, 2) -> 8
 * Note:
 * The array is only modifiable by the update function.
 * You may assume the number of calls to update and sumRange function is distributed evenly.
 *
 * @author Pavel Belevich
 */
public class NumArray {

    private final int[] nums;
    private final int[] tree;

    public NumArray(int[] nums) {
        this.nums = new int[nums.length];
        this.tree = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            update(i, nums[i]);
        }
    }

    public void update(int index, int val) {
        int diff = val - nums[index];
        nums[index] = val;
        for (int i = index + 1; i < tree.length; i = next(i)) {
            tree[i] += diff;
        }
    }

    private int next(int index) {
        return index + (index & -index);
    }

    private int sum(int index) {
        int sum = 0;
        for (int i = index + 1; i > 0; i = parent(i)) {
            sum += tree[i];
        }
        return sum;
    }

    private int parent(int index) {
        return index - (index & -index);
    }

    public int sumRange(int i, int j) {
        return sum(j) - sum(i - 1);
    }

}
