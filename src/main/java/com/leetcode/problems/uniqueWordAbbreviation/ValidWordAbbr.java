package com.leetcode.problems.uniqueWordAbbreviation;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * https://leetcode.com/problems/unique-word-abbreviation/#/description
 * <p>
 * 288. Unique Word Abbreviation
 * <p>
 * An abbreviation of a word follows the form <first letter><number><last letter>. Below are some examples of word abbreviations:
 * <p>
 * a) it                      --> it    (no abbreviation)
 * <p>
 * 1
 * b) d|o|g                   --> d1g
 * <p>
 * 1    1  1
 * 1---5----0----5--8
 * c) i|nternationalizatio|n  --> i18n
 * <p>
 * 1
 * 1---5----0
 * d) l|ocalizatio|n          --> l10n
 * Assume you have a dictionary and given a word, find whether its abbreviation is unique in the dictionary. A word's abbreviation is unique if no other word from the dictionary has the same abbreviation.
 * <p>
 * Example:
 * Given dictionary = [ "deer", "door", "cake", "card" ]
 * <p>
 * isUnique("dear") ->
 * false
 * <p>
 * isUnique("cart") ->
 * true
 * <p>
 * isUnique("cane") ->
 * false
 * <p>
 * isUnique("make") ->
 * true
 *
 * @author Pavel Belevich
 */
public class ValidWordAbbr {

    private Map<String, String> map;

    public ValidWordAbbr(String[] dictionary) {
        map = new HashMap<>(dictionary.length);
        for (String word : dictionary) {
            final String abbr = abbriviate(word);
            final String prev = map.get(abbr);
            if (prev == null) {
                map.put(abbr, word);
            } else {
                if (!word.equals(prev)) {
                    map.put(abbr, "");
                }
            }
        }
    }

    public boolean isUnique(String word) {
        final String s = map.get(abbriviate(word));
        return s == null || Objects.equals(word, s);
    }

    static String abbriviate(String word) {
        if (word.length() < 3) {
            return word;
        }
        final String abbr = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
        if (abbr.length() <= word.length()) {
            return abbr;
        } else {
            return word;
        }
    }

}
