package com.leetcode.problems.decodeString;

/**
 * https://leetcode.com/problems/decode-string/#/description
 * <p>
 * 394. Decode String
 * <p>
 * Given an encoded string, return it's decoded string.
 * <p>
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * <p>
 * You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
 * <p>
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
 * <p>
 * Examples:
 * <p>
 * s = "3[a]2[bc]", return "aaabcbc".
 * s = "3[a2[c]]", return "accaccacc".
 * s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 *
 * @author Pavel Belevich
 */
public class Solution {

    public String decodeString(String s) {
        final char[] chars = s.toCharArray();
        return decodeString(chars, 0, chars.length);
    }

    private String decodeString(char[] chars, int start, int end) {
        final StringBuilder result = new StringBuilder();
        for (int i = start; i < end; ) {
            final char c = chars[i];
            if (c >= 'a' && c <= 'z') {
                result.append(c);
                i++;
            } else if (c >= '0' && c <= '9') {
                int j;
                for (j = i; chars[j] != '['; j++) ;
                int count = Integer.parseInt(new String(chars, i, j - i));
                int subStart = j + 1;
                int stack = 0;
                do {
                    if (chars[j] == '[') {
                        stack++;
                    } else if (chars[j] == ']') {
                        stack--;
                    }
                    j++;
                } while (stack != 0);
                int subEnd = j - 1;
                String subResult = decodeString(chars, subStart, subEnd);
                for (int k = 0; k < count; k++) {
                    result.append(subResult);
                }
                i = j;
            }
        }
        return result.toString();
    }

}
