package com.leetcode.problems.wildcardMatching;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/wildcard-matching/
 *
 * 44. Wildcard Matching
 *
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 *
 * The matching should cover the entire input string (not partial).
 *
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 *
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
        final char[] sChars = Arrays.copyOf(s.toCharArray(), s.length() + 1);
        final char[] pChars = Arrays.copyOf(p.toCharArray(), p.length() + 1);
        return isMatch(sChars, 0, pChars, 0);
    }

    boolean isMatch(char[] sChars, int i, char[] pChars, int j) {
        if (i == sChars.length && j == pChars.length) {
            return true;
        } else if (i == sChars.length || j == pChars.length) {
            return false;
        }
        final char sChar = sChars[i];
        final char pChar = pChars[j];
        if (sChar == pChar || pChar == '?') {
            return isMatch(sChars, i + 1, pChars, j + 1);
        } else if (pChar == '*') {
            boolean result = false;
            for (int k = i; k <= sChars.length; k++) {
                result |= isMatch(sChars, k, pChars, j + 1);
            }
            return result;
        } else {
            return false;
        }
    }

}
