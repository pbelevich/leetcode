package com.leetcode.problems.shortestWordDistanceIII;

/**
 * 245. Shortest Word Distance III
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int shortestWordDistance(String[] words, String word1, String word2) {
        return word1.equals(word2) ? sameWordsDistance(words, word1) : shortestDistance(words, word1, word2);
    }

    private int sameWordsDistance(String[] words, String word) {
        int result = Integer.MAX_VALUE;
        int prev = -1;
        for (int i = 0; i < words.length; i++) {
            if (word.equals(words[i])) {
                if (prev != -1) {
                    result = Math.min(result, i - prev);
                }
                prev = i;
            }
        }
        return result;
    }

    private int shortestDistance(String[] words, String word1, String word2) {
        int result = Integer.MAX_VALUE;
        int i1 = -1;
        int i2 = -1;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.equals(word1)) {
                i1 = i;
            }
            if (word.equals(word2)) {
                i2 = i;
            }
            if (i1 != -1 && i2 != -1) {
                result = Math.min(result, Math.abs(i1 - i2));
            }
        }
        return result;
    }

}
