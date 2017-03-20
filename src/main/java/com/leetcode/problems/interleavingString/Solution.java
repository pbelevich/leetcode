package com.leetcode.problems.interleavingString;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isInterleave(String s1, String s2, String s3) {
        return isInterleave(s1.toCharArray(), 0, s2.toCharArray(), 0, s3.toCharArray(), 0);
    }

    private boolean isInterleave(char[] s1, int i1, char[] s2, int i2, char[] s3, int i3) {
        if (i1 == s1.length && i2 == s2.length && i3 == s3.length) {
            return true;
        } else if (i1 < s1.length && i2 < s2.length && i3 < s3.length && s1[i1] == s3[i3] && s2[i2] == s3[i3]) {
            return isInterleave(s1, i1 + 1, s2, i2, s3, i3 + 1) || isInterleave(s1, i1, s2, i2 + 1, s3, i3 + 1);
        } else if (i1 < s1.length && i3 < s3.length && s1[i1] == s3[i3]) {
            return isInterleave(s1, i1 + 1, s2, i2, s3, i3 + 1);
        } else if (i2 < s2.length && i3 < s3.length && s2[i2] == s3[i3]) {
            return isInterleave(s1, i1, s2, i2 + 1, s3, i3 + 1);
        } else {
            return false;
        }
    }

}
