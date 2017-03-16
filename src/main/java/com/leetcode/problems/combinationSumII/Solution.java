package com.leetcode.problems.combinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum-ii/#/description
 * <p>
 * 40. Combination Sum II
 * <p>
 * Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
 * <p>
 * Each number in C may only be used once in the combination.
 * <p>
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
 * A solution set is:
 * [
 * [1, 7],
 * [1, 2, 5],
 * [2, 6],
 * [1, 1, 6]
 * ]
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        combinationSum(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void combinationSum(int[] candidates, int c, int target, ArrayList<Integer> res, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(res));
        } else {
            for (int i = c; i < candidates.length && candidates[i] <= target; i += f(candidates, i)) {
                res.add(candidates[i]);
                combinationSum(candidates, i + 1, target - candidates[i], res, result);
                res.remove((Integer) candidates[i]);
            }
        }
    }

    int f(int[] candidates, int i) {
        int result;
        for (result = 0; i + result < candidates.length && candidates[i + result] == candidates[i]; result++) ;
        return result;
    }

}
