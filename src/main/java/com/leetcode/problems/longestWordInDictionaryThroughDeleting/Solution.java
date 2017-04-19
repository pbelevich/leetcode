package com.leetcode.problems.longestWordInDictionaryThroughDeleting;

import java.util.List;

/**
 * https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/#/description
 * <p>
 * 524. Longest Word in Dictionary through Deleting
 *
 * @author Pavel Belevich
 */
public class Solution {

    public String findLongestWord(String s, List<String> d) {
        final char[] chars = s.toCharArray();
        String longest = "";
        int l = 0;
        for (String word : d) {
            int i = 0;
            for (char c : chars) {
                if (i < word.length() && c == word.charAt(i)) {
                    i++;
                }
                if (i == word.length() && word.length() >= longest.length()) {
                    if (word.length() > longest.length() || word.compareTo(longest) < 0) {
                        longest = word;
                    }
                }
            }
        }
        return longest;
    }

}
