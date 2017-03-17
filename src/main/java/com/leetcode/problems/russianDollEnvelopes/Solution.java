package com.leetcode.problems.russianDollEnvelopes;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/russian-doll-envelopes/#/description
 * <p>
 * 354. Russian Doll Envelopes
 * <p>
 * You have a number of envelopes with widths and heights given as a pair of integers (w, h). One envelope can fit into another if and only if both the width and height of one envelope is greater than the width and height of the other envelope.
 * <p>
 * What is the maximum number of envelopes can you Russian doll? (put one inside other)
 * <p>
 * Example:
 * Given envelopes = [[5,4],[6,4],[6,7],[2,3]], the maximum number of envelopes you can Russian doll is 3 ([2,3] => [5,4] => [6,7]).
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length < 2) {
            return envelopes.length;
        }
        Arrays.sort(envelopes, Comparator.comparingInt(o -> o[0]));
        int[] res = new int[envelopes.length];
        Arrays.fill(res, 1);
        for (int i = 0; i < envelopes.length; i++) {
            int[] I = envelopes[i];
            for (int j = i + 1; j < envelopes.length; j++) {
                int[] J = envelopes[j];
                if (J[1] > I[1] && J[0] > I[0]) {
                    res[j] = Math.max(res[j], 1 + res[i]);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < res.length; i++) {
            max = Math.max(max, res[i]);
        }
        return max;
    }

}
