package com.leetcode.problems.convertANumberToHexadecimal;

/**
 * https://leetcode.com/problems/convert-a-number-to-hexadecimal/#/description
 * <p>
 * 405. Convert a Number to Hexadecimal
 * <p>
 * Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.
 * <p>
 * Note:
 * <p>
 * All letters in hexadecimal (a-f) must be in lowercase.
 * The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
 * The given number is guaranteed to fit within the range of a 32-bit signed integer.
 * You must not use any method provided by the library which converts/formats the number to hex directly.
 * Example 1:
 * <p>
 * Input:
 * 26
 * <p>
 * Output:
 * "1a"
 * Example 2:
 * <p>
 * Input:
 * -1
 * <p>
 * Output:
 * "ffffffff"
 *
 * @author Pavel Belevich
 */
public class Solution {

    private static final char[] digits = new char[] {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        long numLong = num > 0 ? num : ((1L << 32) + num) ;
        toHex(numLong, result);
        return result.toString();
    }

    private void toHex(long num, StringBuilder result) {
        if (num != 0) {
            result.insert(0, digits[(int) (num % 0x10)]);
            toHex(num / 0x10, result);
        }
    }

}
