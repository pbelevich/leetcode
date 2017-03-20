package com.leetcode.problems.interleavingString;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isInterleave(String s1, String s2, String s3) {
        return isInterleave(new Boolean[s1.length() + 1][s2.length() + 1][s3.length() + 1], s1.toCharArray(), 0, s2.toCharArray(), 0, s3.toCharArray(), 0);
    }

    private boolean isInterleave(Boolean[][][] cache, char[] s1, int i1, char[] s2, int i2, char[] s3, int i3) {
        if (cache[i1][i2][i3] == null) {
            if (i1 == s1.length && i2 == s2.length && i3 == s3.length) {
                cache[i1][i2][i3] = true;
            } else if (i1 < s1.length && i2 < s2.length && i3 < s3.length && s1[i1] == s3[i3] && s2[i2] == s3[i3]) {
                cache[i1][i2][i3] = isInterleave(cache, s1, i1 + 1, s2, i2, s3, i3 + 1) || isInterleave(cache, s1, i1, s2, i2 + 1, s3, i3 + 1);
            } else if (i1 < s1.length && i3 < s3.length && s1[i1] == s3[i3]) {
                cache[i1][i2][i3] = isInterleave(cache, s1, i1 + 1, s2, i2, s3, i3 + 1);
            } else if (i2 < s2.length && i3 < s3.length && s2[i2] == s3[i3]) {
                cache[i1][i2][i3] = isInterleave(cache, s1, i1, s2, i2 + 1, s3, i3 + 1);
            } else {
                cache[i1][i2][i3] = false;
            }
        }
        return cache[i1][i2][i3];
    }

}
