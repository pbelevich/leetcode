package com.leetcode.problems.permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations/#/description
 * <p>
 * 46. Permutations
 * <p>
 * Given a collection of distinct numbers, return all possible permutations.
 * <p>
 * For example,
 * [1,2,3] have the following permutations:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int n : nums) {
            res.add(n);
        }
        permute(res, 0, result);
        return result;
    }

    private void permute(List<Integer> res, int i, List<List<Integer>> result) {
        if (i == res.size()) {
            result.add(new ArrayList<>(res));
        } else {
            for (int j = i; j < res.size(); j++) {
                swap(res, i, j);
                permute(res, i + 1, result);
                swap(res, i, j);
            }
        }
    }

    static void swap(List<Integer> list, int i, int j) {
        Integer temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

}
