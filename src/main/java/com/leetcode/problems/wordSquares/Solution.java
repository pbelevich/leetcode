package com.leetcode.problems.wordSquares;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/word-squares/#/description
 * <p>
 * 425. Word Squares
 * <p>
 * Given a set of words (without duplicates), find all word squares you can build from them.
 * <p>
 * A sequence of words forms a valid word square if the kth row and column read the exact same string, where 0 ≤ k < max(numRows, numColumns).
 * <p>
 * For example, the word sequence ["ball","area","lead","lady"] forms a word square because each word reads the same both horizontally and vertically.
 * <p>
 * b a l l
 * a r e a
 * l e a d
 * l a d y
 * Note:
 * There are at least 1 and at most 1000 words.
 * All words will have the exact same length.
 * Word length is at least 1 and at most 5.
 * Each word contains only lowercase English alphabet a-z.
 * Example 1:
 * <p>
 * Input:
 * ["area","lead","wall","lady","ball"]
 * <p>
 * Output:
 * [
 * [ "wall",
 * "area",
 * "lead",
 * "lady"
 * ],
 * [ "ball",
 * "area",
 * "lead",
 * "lady"
 * ]
 * ]
 * <p>
 * Explanation:
 * The output consists of two word squares. The order of output does not matter (just the order of words in each word square matters).
 * Example 2:
 * <p>
 * Input:
 * ["abat","baba","atan","atal"]
 * <p>
 * Output:
 * [
 * [ "baba",
 * "abat",
 * "baba",
 * "atan"
 * ],
 * [ "baba",
 * "abat",
 * "baba",
 * "atal"
 * ]
 * ]
 * <p>
 * Explanation:
 * The output consists of two word squares. The order of output does not matter (just the order of words in each word square matters).
 *
 * @author Pavel Belevich
 */
public class Solution {

    static class Trie {

        Trie[] kids = new Trie['z' - 'a' + 1];
        Collection<String> words = new ArrayList<>();

    }

    private int N;
    private Trie trie;

    public List<List<String>> wordSquares(String[] words) {
        if (words == null || words.length == 0) {
            return Collections.emptyList();
        }
        this.N = words[0].length();
        this.trie = buildTrie(words);
        List<List<String>> result = new ArrayList<>();
        String[] solution = new String[N];
        solve(0, solution, result);
        return result;
    }

    private void solve(int w, String[] solution, List<List<String>> result) {
        if (w == N) {
            result.add(new ArrayList<>(Arrays.asList(solution)));
        } else {
            char[] prefix = prefix(solution, w);
            for (String word : wordsStartingWith(prefix)) {
                solution[w] = word;
                solve(w + 1, solution, result);
            }
        }
    }

    private Iterable<String> wordsStartingWith(char[] prefix) {
        Trie trie = this.trie;
        for (char c : prefix) {
            trie = trie.kids[c - 'a'];
            if (trie == null) {
                return Collections.emptyList();
            }
        }
        return trie.words;
    }

    private char[] prefix(String[] solution, int w) {
        final char[] result = new char[w];
        for (int i = 0; i < w; i++) {
            result[i] = solution[i].charAt(w);
        }
        return result;
    }

    private Trie buildTrie(String[] words) {
        Trie root = new Trie();
        for (String word : words) {
            insert(root, word, word.toCharArray(), 0);
        }
        return root;
    }

    private Trie insert(Trie node, String word, char[] chars, int i) {
        if (node == null) {
            node = new Trie();
        }
        node.words.add(word);
        if (i < chars.length) {
            node.kids[chars[i] - 'a'] = insert(node.kids[chars[i] - 'a'], word, chars, i + 1);
        }
        return node;
    }

}
