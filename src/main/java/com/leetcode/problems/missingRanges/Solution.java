package com.leetcode.problems.missingRanges;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/missing-ranges/#/description
 * <p>
 * 163. Missing Ranges
 * <p>
 * Given a sorted integer array where the range of elements are in the inclusive range [lower, upper], return its missing ranges.
 * <p>
 * For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, return ["2", "4->49", "51->74", "76->99"].
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            result.add(range(lower, upper));
        } else {
            final int first = nums[0];
            if (lower != first) {
                result.add(range(lower, first - 1));
            }
            for (int i = 1; i < nums.length; i++) {
                if ((long)nums[i] - (long)nums[i - 1] > 1L) {
                    result.add(range(nums[i - 1] + 1, nums[i] - 1));
                }
            }
            final int last = nums[nums.length - 1];
            if (last != upper) {
                result.add(range(last + 1, upper));
            }
        }
        return result;
    }

    String range(int lo, int hi) {
        return lo == hi ? String.valueOf(lo) : lo + "->" + hi;
    }

}
