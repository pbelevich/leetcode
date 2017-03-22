package com.leetcode.problems.removeDuplicateLetters;

/**
 * https://leetcode.com/problems/remove-duplicate-letters/#/solutions
 * <p>
 * 316. Remove Duplicate Letters
 * <p>
 * Given a string which contains only lowercase letters, remove duplicate letters so that every letter appear once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
 * <p>
 * Example:
 * Given "bcabc"
 * Return "abc"
 * <p>
 * Given "cbacdcbc"
 * Return "acdb"
 *
 * @author Pavel Belevich
 */
public class Solution {

    public String removeDuplicateLetters(String s) {
        final char[] chars = s.toCharArray();
        int[] count = new int['z' - 'a' + 1];
        int n = 0;
        for (char c : chars) {
            if (0 == count[c - 'a']++) {
                n++;
            }
        }
        boolean[] added = new boolean['z' - 'a' + 1];
        final char[] result = new char[n];
        int k = -1;
        char c;
        for (int i = 0; i < n; i++) {
            c = Character.MAX_VALUE;
            for (int j = k + 1; j < chars.length; j++) {
                if (added[chars[j] - 'a']) {
                    continue;
                }
                if (chars[j] < c) {
                    c = chars[j];
                    k = j;
                }
                if (0 == --count[chars[j] - 'a']) {
                    for (int x = k + 1; x <= j; x++) {
                        count[chars[x] - 'a']++;
                    }
                    break;
                }
            }
            result[i] = c;
            added[c - 'a'] = true;
        }

        return new String(result);
    }

}
