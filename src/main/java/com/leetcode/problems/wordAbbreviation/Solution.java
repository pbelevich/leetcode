package com.leetcode.problems.wordAbbreviation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/word-abbreviation/#/description
 * <p>
 * 527. Word Abbreviation
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<String> wordsAbbreviation(List<String> dict) {
        final ArrayList<String> result = new ArrayList<>(dict);
        Collection<Integer> coll = new ArrayList<>();
        for (int i = 0; i < dict.size(); i++) {
            coll.add(i);
        }

        for (int size = 1; !coll.isEmpty(); size++) {
            final Set<Integer> newColl = new HashSet<>();
            Map<String, Integer> map = new HashMap<>();
            for (int i : coll) {
                final String word = dict.get(i);
                final String abbr = abbr(word, size);
                final Integer prev = map.get(abbr);
                if (prev != null) {
                    newColl.add(prev);
                    newColl.add(i);
                } else {
                    map.put(abbr, i);
                }
                result.set(i, abbr);
            }
            coll = newColl;
        }
        return result;
    }

    static String abbr(String word, int size) {
        int n = word.length() - 1 - size;
        if (n >= 2) {
            return word.substring(0, size) + n + word.substring(word.length() - 1);
        }
        return word;
    }

}
