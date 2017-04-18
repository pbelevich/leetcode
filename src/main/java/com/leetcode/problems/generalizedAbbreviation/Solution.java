package com.leetcode.problems.generalizedAbbreviation;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generalized-abbreviation/#/description
 * <p>
 * 320. Generalized Abbreviation
 * <p>
 * Write a function to generate the generalized abbreviations of a word.
 * <p>
 * Example:
 * Given word = "word", return the following list (order does not matter):
 * ["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<String> generateAbbreviations(String word) {
        final char[] chars = word.toCharArray();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < (1 << word.length()); i++) {
            result.add(abbr(chars, i));
        }
        return result;
    }

    static String abbr(char[] chars, int i) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int j = 0; j < chars.length; j++, i >>= 1) {
            if ((i & 1) == 0) {
                if (counter != 0) {
                    sb.append(counter);
                    counter = 0;
                }
                sb.append(chars[j]);
            } else {
                counter++;
            }
        }
        if (counter != 0) {
            sb.append(counter);
        }
        return sb.toString();
    }

}
