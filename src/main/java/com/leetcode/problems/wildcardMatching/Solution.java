package com.leetcode.problems.wildcardMatching;

/**
 * https://leetcode.com/problems/wildcard-matching/
 * <p>
 * 44. Wildcard Matching
 * <p>
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * <p>
 * The matching should cover the entire input string (not partial).
 * <p>
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * <p>
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "*") → true
 * isMatch("aa", "a*") → true
 * isMatch("ab", "?*") → true
 * isMatch("aab", "c*a*b") → false
 *
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isMatch(String s, String p) {
        final char[] sChars = s.toCharArray();
        final char[] pChars = p.toCharArray();

        final boolean[][] isMatch = new boolean[sChars.length + 2][pChars.length + 2];

        isMatch[sChars.length + 1][pChars.length + 1] = true;

        for (int j = pChars.length; j >= 0; j--) {
            for (int i = sChars.length; i >= 0; i--) {
                final char sChar = charAt(sChars, i);
                final char pChar = charAt(pChars, j);
                if (sChar == pChar || pChar == '?') {
                    isMatch[i][j] = isMatch[i + 1][j + 1];
                } else if (pChar == '*') {
                    boolean result = false;
                    for (int k = i; k < sChars.length + 2 && !result; k++) {
                        result = isMatch[k][j + 1];
                    }
                    isMatch[i][j] = result;
                } else {
                    isMatch[i][j] = false;
                }
            }
        }

        return isMatch[0][0];
    }

    private char charAt(char[] s, int i) {
        return i < s.length ? s[i] : 0;
    }

}
