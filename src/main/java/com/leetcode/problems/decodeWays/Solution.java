package com.leetcode.problems.decodeWays;

/**
 * https://leetcode.com/problems/decode-ways/#/description
 * <p>
 * 91. Decode Ways
 * <p>
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 * <p>
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given an encoded message containing digits, determine the total number of ways to decode it.
 * <p>
 * For example,
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 * <p>
 * The number of ways decoding "12" is 2.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int numDecodings(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        final char[] chars = s.toCharArray();

        int[] numDecodings = new int[chars.length + 1];

        for (int start = chars.length; start >= 0; start--) {
            numDecodings[start] = numDecodings(chars, start, numDecodings);
        }

        return numDecodings[0];
    }

    private int numDecodings(char[] chars, int start, int[] numDecodings) {
        if (start == chars.length) {
            return 1;
        }
        if (chars[start] == '0') {
            return 0;
        }
        int result = numDecodings[start + 1];
        if ((chars[start] == '1' && start + 1 < chars.length) || (chars[start] == '2' && start + 1 < chars.length && chars[start + 1] <= '6')) {
            result += numDecodings[start + 2];
        }
        return result;
    }

}
