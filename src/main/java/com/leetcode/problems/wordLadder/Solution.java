package com.leetcode.problems.wordLadder;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

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

    static class Context {
        Queue<String> queue = new ArrayDeque<>();
        Map<String, Boolean> visited = new HashMap<>();
        int level;

        Context(String begin) {
            queue.offer(begin);
            visited.put(begin, true);
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        Set<String> words = new HashSet<>(wordList);
        words.add(beginWord);
        words.add(endWord);

        final Context bContext = new Context(beginWord);
        final Context eContext = new Context(endWord);
        Context active = bContext;
        Context inactive = eContext;
        while (!active.queue.isEmpty()) {
            int size = active.queue.size();
            for (int i = 0; i < size; i++) {
                final String word = active.queue.poll();
                if (inactive.visited.getOrDefault(word, false)) {
                    return active.level + inactive.level + 1;
                }
                for (String w : adj(words, word)) {
                    if (!active.visited.getOrDefault(w, false)) {
                        active.queue.offer(w);
                        active.visited.put(w, true);
                    }
                }
            }
            active.level++;

            active = active == bContext ? eContext : bContext;
            inactive = inactive == bContext ? eContext : bContext;
        }
        return 0;
    }

    private Collection<String> adj(Set<String> words, String word) {
        final Collection<String> adj = new ArrayList<>();
        final char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            for (char x = 'a'; x <= 'z'; x++) {
                if (x != c) {
                    chars[i] = x;
                    final String newWord = new String(chars);
                    if (words.contains(newWord)) {
                        adj.add(newWord);
                    }
                }
            }
            chars[i] = c;
        }
        return adj;
    }

}
