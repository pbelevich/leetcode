package com.leetcode.problems.shortestWordDistance;

/**
 * 243. Shortest Word Distance
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int shortestDistance(String[] words, String word1, String word2) {
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
