package com.leetcode.problems.maximumSizeSubarraySumEqualsK;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/#/description
 * <p>
 * 325. Maximum Size Subarray Sum Equals k
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> sums = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums.put(sum, i);
        }
        int max = 0;
        sum = 0;
        for (int j = 0; j < nums.length; j++) {
            final Integer i = sums.get(k + sum);
            if (i != null) {
                max = Math.max(max, i - j + 1);
            }
            int n = nums[j];
            sum += n;
        }
        return max;
    }

}
