package com.leetcode.problems.letterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/#/description
 * <p>
 * 17. Letter Combinations of a Phone Number
 * <p>
 * Given a digit string, return all possible letter combinations that the number could represent.
 * <p>
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * <p>
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 * @author Pavel Belevich
 */
public class Solution {

    static final char[][] map = new char[10][];

    static {
        map[2] = "abc".toCharArray();
        map[3] = "def".toCharArray();
        map[4] = "ghi".toCharArray();
        map[5] = "jkl".toCharArray();
        map[6] = "mno".toCharArray();
        map[7] = "pqrs".toCharArray();
        map[8] = "tuv".toCharArray();
        map[9] = "wxyz".toCharArray();
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        final char[] chars = digits.toCharArray();
        char[] letters = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            int digit = chars[i] - '0';
            letters[i] = map[digit][0];
        }
        do {
            result.add(new String(letters));
        } while (increment(chars, letters));
        return result;
    }

    boolean increment(char[] digits, char[] letters) {
        int carry = 1;
        int i;
        for (i = 0; i < digits.length && carry > 0; i++) {
            final int digit = digits[i] - '0';
            final char[] chars = map[digit];
            if (letters[i] == chars[chars.length - 1]) {
                letters[i] = chars[0];
            } else {
                letters[i]++;
                carry = 0;
            }
        }
        return i < digits.length || carry == 0;
    }

}
