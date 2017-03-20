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
        if (!counting(chars1, chars2, chars3)) {
            return false;
        }
        boolean[][] isInterleave = new boolean[chars1.length + 1][chars2.length + 1];
        for (int i1 = chars1.length; i1 >= 0; i1--) {
            for (int i2 = chars2.length; i2 >= 0; i2--) {
                int i3 = i1 + i2;
                if (i1 == chars1.length && i2 == chars2.length && i3 == chars3.length) {
                    isInterleave[i1][i2] = true;
                } else if (i1 < chars1.length && i2 < chars2.length && i3 < chars3.length && chars1[i1] == chars3[i3] && chars2[i2] == chars3[i3]) {
                    isInterleave[i1][i2] = isInterleave[i1 + 1][i2] || isInterleave[i1][i2 + 1];
                } else if (i1 < chars1.length && i3 < chars3.length && chars1[i1] == chars3[i3]) {
                    isInterleave[i1][i2] = isInterleave[i1 + 1][i2];
                } else if (i2 < chars2.length && i3 < chars3.length && chars2[i2] == chars3[i3]) {
                    isInterleave[i1][i2] = isInterleave[i1][i2 + 1];
                }
            }
        }
        return isInterleave[0][0];
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

}
