package com.leetcode.problems.countAndSay;

/**
 * https://leetcode.com/problems/count-and-say/#/description
 * <p>
 * 38. Count and Say
 * <p>
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * <p>
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 * <p>
 * Note: The sequence of integers will be represented as a string.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public String countAndSay(int n) {
        char[] chars = new char[]{'1'};
        for (int i = 1; i < n; i++) {
            char prev = 0;
            int count = 0;
            final StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < chars.length; j++) {
                char c = chars[j];
                if (prev == c) {
                    count++;
                } else {
                    if (j != 0) {
                        stringBuilder.append(count);
                        stringBuilder.append(prev);
                    }
                    prev = c;
                    count = 1;
                }
            }
            stringBuilder.append(count);
            stringBuilder.append(prev);
            chars = stringBuilder.toString().toCharArray();
        }
        return new String(chars);
    }

}
