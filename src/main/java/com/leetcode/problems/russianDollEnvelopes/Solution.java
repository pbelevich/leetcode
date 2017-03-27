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

    private static final Comparator<int[]> byWidthThenByHeightReversed = new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            final int byWidth = Integer.compare(o1[0], o2[0]);
            return byWidth == 0 ? Integer.compare(o2[1], o1[1]) : byWidth;
        }
    };

    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, byWidthThenByHeightReversed);
        int[] dp = new int[envelopes.length];
        int len = 0;
        for (int[] e : envelopes) {
            final int h = e[1];
            int i = Arrays.binarySearch(dp, 0, len, h);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = h;
            if (i == len) {
                len++;
            }
        }
        return len;
    }

}
