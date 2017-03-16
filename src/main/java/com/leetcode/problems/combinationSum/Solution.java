package com.leetcode.problems.combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum/#/description
 * <p>
 * 39. Combination Sum
 * <p>
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
 * <p>
 * The same repeated number may be chosen from C unlimited number of times.
 * <p>
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set [2, 3, 6, 7] and target 7,
 * A solution set is:
 * [
 * [7],
 * [2, 2, 3]
 * ]
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        combinationSum(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void combinationSum(int[] candidates, int c, int target, ArrayList<Integer> res, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(res));
        } else {
            for (int i = c; i < candidates.length && candidates[i] <= target; i++) {
                res.add(candidates[i]);
                combinationSum(candidates, i, target - candidates[i], res, result);
                res.remove((Integer) candidates[i]);
            }
        }
    }

}
