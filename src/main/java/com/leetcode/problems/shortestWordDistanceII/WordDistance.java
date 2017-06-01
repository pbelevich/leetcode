package com.leetcode.problems.shortestWordDistanceII;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * 244. Shortest Word Distance II
 *
 * @author Pavel Belevich
 */
public class WordDistance {

    private static final int[] EMPTY = new int[0];
    private Map<String, Collection<Integer>> map = new HashMap<>();

    public WordDistance(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            map.computeIfAbsent(word, w -> new TreeSet<>()).add(i);
        }
    }

    public int shortest(String word1, String word2) {
        int result = Integer.MAX_VALUE;

        final int[] indices1 = getIndices(word1);
        final int[] indices2 = getIndices(word2);

        for (int i1 = 0, i2 = 0; i1 < indices1.length && i2 < indices2.length; ) {
            final int index1 = indices1[i1];
            final int index2 = indices2[i2];
            result = Math.min(result, Math.abs(index1 - index2));
            if (index1 < index2) {
                i1++;
            } else {
                i2++;
            }
        }

        return result;
    }

    private int[] getIndices(String word) {
        final Collection<Integer> coll = map.get(word);
        return coll != null ? coll.stream().mapToInt(i -> i).toArray() : EMPTY;
    }

}
