package com.leetcode.problems.interleavingString;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Key {
        final int i1;
        final int i2;
        final int i3;

        public Key(int i1, int i2, int i3) {
            this.i1 = i1;
            this.i2 = i2;
            this.i3 = i3;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Key key = (Key) o;

            if (i1 != key.i1) return false;
            if (i2 != key.i2) return false;
            return i3 == key.i3;
        }

        @Override
        public int hashCode() {
            int result = i1;
            result = 31 * result + i2;
            result = 31 * result + i3;
            return result;
        }
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        return isInterleave(new HashMap<>(), s1.toCharArray(), 0, s2.toCharArray(), 0, s3.toCharArray(), 0);
    }

    private boolean isInterleave(Map<Key, Boolean> cache, char[] s1, int i1, char[] s2, int i2, char[] s3, int i3) {
        return cache.computeIfAbsent(new Key(i1, i2, i3), k -> {
            if (i1 == s1.length && i2 == s2.length && i3 == s3.length) {
                return true;
            } else if (i1 < s1.length && i2 < s2.length && i3 < s3.length && s1[i1] == s3[i3] && s2[i2] == s3[i3]) {
                return isInterleave(cache, s1, i1 + 1, s2, i2, s3, i3 + 1) || isInterleave(cache, s1, i1, s2, i2 + 1, s3, i3 + 1);
            } else if (i1 < s1.length && i3 < s3.length && s1[i1] == s3[i3]) {
                return isInterleave(cache, s1, i1 + 1, s2, i2, s3, i3 + 1);
            } else if (i2 < s2.length && i3 < s3.length && s2[i2] == s3[i3]) {
                return isInterleave(cache, s1, i1, s2, i2 + 1, s3, i3 + 1);
            } else {
                return false;
            }
        });
    }

}
