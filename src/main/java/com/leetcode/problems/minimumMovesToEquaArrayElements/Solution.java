package com.leetcode.problems.minimumMovesToEquaArrayElements;

/**
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/#/description
 * <p>
 * 453. Minimum Moves to Equal Array Elements
 * <p>
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.
 * <p>
 * Example:
 * <p>
 * Input:
 * [1,2,3]
 * <p>
 * Output:
 * 3
 * <p>
 * Explanation:
 * Only three moves are needed (remember each move increments two elements):
 * <p>
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 *
 * @author Pavel Belevich
 */
public class Solution {

    /**
     * Adding 1 to n - 1 elements is the same as subtracting 1 from one element, w.r.t goal of making the elements in the array equal.
     * So, best way to do this is make all the elements in the array equal to the min element.
     * sum(array) - n * minimum
     */
    public int minMoves(int[] nums) {
        if (nums.length == 0) return 0;
        int min = nums[0];
        for (int n : nums) min = Math.min(min, n);
        int res = 0;
        for (int n : nums) res += n - min;
        return res;
    }

}
