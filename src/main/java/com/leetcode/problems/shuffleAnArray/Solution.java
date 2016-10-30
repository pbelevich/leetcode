package com.leetcode.problems.shuffleAnArray;

import java.util.Arrays;

public class Solution {

    private final int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] shuffle = Arrays.copyOf(this.nums, this.nums.length);
        for (int i = 0; i < shuffle.length; i++) {
            int j = (int) (i + (shuffle.length - i) * Math.random());
            int temp = shuffle[i];
            shuffle[i] = shuffle[j];
            shuffle[j] = temp;
        }
        return shuffle;
    }

}
