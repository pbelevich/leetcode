package com.leetcode.problems.removeKDigits;

/**
 * https://leetcode.com/problems/remove-k-digits/#/description
 * <p>
 * 402. Remove K Digits
 * <p>
 * Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.
 * <p>
 * Note:
 * The length of num is less than 10002 and will be ≥ k.
 * The given num does not contain any leading zero.
 * Example 1:
 * <p>
 * Input: num = "1432219", k = 3
 * Output: "1219"
 * Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
 * Example 2:
 * <p>
 * Input: num = "10200", k = 1
 * Output: "200"
 * Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
 * Example 3:
 * <p>
 * Input: num = "10", k = 2
 * Output: "0"
 * Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public String removeKdigits(String num, int k) {
        char[] chars = num.toCharArray();
        if (k == chars.length) {
            return "0";
        }
        int length = chars.length;
        int indexToDrop = 0;
        for (int i = 0; i < k && length > 0; i++) {
            while (indexToDrop + 1 < length && chars[indexToDrop] <= chars[indexToDrop + 1]) indexToDrop++;
            length = drop(chars, length, indexToDrop);
            if (indexToDrop > 0) indexToDrop--;
            length = dropLeadingZeros(chars, length);
        }
        if (length == 0) {
            return "0";
        }
        return new String(chars, 0, length);
    }

    int drop(char[] chars, int length, int start) {
        System.arraycopy(chars, 0, chars, 0, start);
        if (start + 1 < chars.length) System.arraycopy(chars, start + 1, chars, start, length - 1 - start);
        return length - 1;
    }

    int dropLeadingZeros(char[] chars, int length) {
        int zeros;
        for (zeros = 0; zeros < length && chars[zeros] == '0'; zeros++) ;
        System.arraycopy(chars, zeros, chars, 0, length - zeros);
        return length - zeros;
    }

}
