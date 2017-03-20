package com.leetcode.problems.interleavingString;

/**
 * https://leetcode.com/problems/interleaving-string/#/description
 * <p>
 * 97. Interleaving String
 * <p>
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
 * <p>
 * For example,
 * Given:
 * s1 = "aabcc",
 * s2 = "dbbca",
 * <p>
 * When s3 = "aadbbcbcac", return true.
 * When s3 = "aadbbbaccc", return false.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        final char[] chars1 = s1.toCharArray();
        final char[] chars2 = s2.toCharArray();
        final char[] chars3 = s3.toCharArray();
        return counting(chars1, chars2, chars3) && isInterleave(new Boolean[s1.length() + 1][s2.length() + 1][s3.length() + 1], chars1, 0, chars2, 0, chars3, 0);
    }

    boolean counting(char[] s1, char[] s2, char[] s3) {
        int[] count = new int[256];
        for (char c : s1) {
            count[c]++;
        }
        for (char c : s2) {
            count[c]++;
        }
        for (char c : s3) {
            count[c]--;
        }
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    boolean isInterleave(Boolean[][][] cache, char[] s1, int i1, char[] s2, int i2, char[] s3, int i3) {
        if (cache[i1][i2][i3] == null) {
            if (i1 == s1.length && i2 == s2.length && i3 == s3.length) {
                cache[i1][i2][i3] = true;
            } else if (i1 < s1.length && i2 < s2.length && i3 < s3.length && s1[i1] == s3[i3] && s2[i2] == s3[i3]) {
                cache[i1][i2][i3] = isInterleave(cache, s1, i1 + 1, s2, i2, s3, i3 + 1) || isInterleave(cache, s1, i1, s2, i2 + 1, s3, i3 + 1);
            } else if (i1 < s1.length && i3 < s3.length && s1[i1] == s3[i3]) {
                cache[i1][i2][i3] = isInterleave(cache, s1, i1 + 1, s2, i2, s3, i3 + 1);
            } else
                cache[i1][i2][i3] = i2 < s2.length && i3 < s3.length && s2[i2] == s3[i3] && isInterleave(cache, s1, i1, s2, i2 + 1, s3, i3 + 1);
        }
        return cache[i1][i2][i3];
    }

}
