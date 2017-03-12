package com.leetcode.problems.wordLadder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/word-ladder/
 * <p>
 * 127. Word Ladder
 * <p>
 * Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:
 * <p>
 * Only one letter can be changed at a time.
 * Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
 * For example,
 * <p>
 * Given:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log","cog"]
 * As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * return its length 5.
 * <p>
 * Note:
 * Return 0 if there is no such transformation sequence.
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 * You may assume no duplicates in the word list.
 * You may assume beginWord and endWord are non-empty and are not the same.
 *
 * @author Pavel Belevich
 */
public class Solution {

    private Map<String, Iterable<Integer>> hashes = new HashMap<>();

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<Integer, Collection<String>> map = new HashMap<>();
        for (String word : wordList) {
            put(map, word);
        }
        Map<String, Integer> dist = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>();
        dist.put(beginWord, 1);
        Queue<String> queue = new PriorityQueue<>((o1, o2) -> dist.get(o1).compareTo(dist.get(o2)));
        queue.offer(beginWord);
        String word;
        while (!queue.isEmpty() && !endWord.equals(word = queue.poll())) {
            visited.put(word, true);
            put(map, dist, word, visited, queue);
        }
        return dist.getOrDefault(endWord, 0);
    }

    private void put(Map<Integer, Collection<String>> map, Map<String, Integer> dist, String word, Map<String, Boolean> visited, Queue<String> queue) {
        final Integer distToWord = dist.get(word);
        for (Integer hash : hashes(word)) {
            final Collection<String> adj = map.get(hash);
            if (adj != null) {
                for (String adjusted : adj) {
                    if (!word.equals(adjusted)) {
                        final Integer distToAdjusted = dist.get(adjusted);
                        if (distToAdjusted == null || distToWord + 1 < distToAdjusted) {
                            dist.put(adjusted, distToWord + 1);
                        }
                        if (!visited.getOrDefault(adjusted, false)) {
                            if (queue.contains(adjusted)) {
                                queue.remove(adjusted);
                            }
                            queue.offer(adjusted);
                        }
                    }
                }
            }
        }
    }

    void put(Map<Integer, Collection<String>> map, String word) {
        for (Integer hash : hashes(word)) {
            Collection<String> words = map.get(hash);
            if (words == null) {
                words = new ArrayList<>();
                map.put(hash, words);
            }
            words.add(word);
        }
    }

    Iterable<Integer> hashes(String word) {
        return hashes.computeIfAbsent(word, w -> {
            final char[] chars = word.toCharArray();
            Collection<Integer> result = new ArrayList<>();
            for (int i = 0; i < chars.length; i++) {
                char temp = chars[i];
                chars[i] = 0;
                result.add(Arrays.hashCode(chars));
                chars[i] = temp;
            }
            return result;
        });
    }

}

