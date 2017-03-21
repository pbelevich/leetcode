package com.leetcode.problems.wordSearchII;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * https://leetcode.com/problems/word-search-ii/#/description
 * <p>
 * 212. Word Search II
 * <p>
 * Given a 2D board and a list of words from the dictionary, find all words in the board.
 * <p>
 * Each word must be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.
 * <p>
 * For example,
 * Given words = ["oath","pea","eat","rain"] and board =
 * <p>
 * [
 * ['o','a','a','n'],
 * ['e','t','a','e'],
 * ['i','h','k','r'],
 * ['i','f','l','v']
 * ]
 * Return ["eat","oath"].
 *
 * @author Pavel Belevich
 */
public class Solution {

    private int N;
    private int M;
    private boolean[][] visited;
    private Collection<String> result;

    static class Trie {
        String s;
        Trie[] kids = new Trie['z' - 'a' + 1];
    }

    public List<String> findWords(char[][] board, String[] words) {
        N = board.length;
        M = board[0].length;
        if (N * M == 0 || words.length == 0) {
            return Collections.emptyList();
        }
        result = new HashSet<>(words.length);
        Trie trie = buildTrie(words);
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                exist1(board, i, j, trie);
            }
        }
        return new ArrayList<>(result);
    }

    Trie buildTrie(String[] words) {
        Trie root = new Trie();
        for (String word : words) {
            final char[] chars = word.toCharArray();
            Trie curr = root;
            for (char c : chars) {
                Trie kid = curr.kids[c - 'a'];
                if (kid == null) {
                    kid = new Trie();
                    curr.kids[c - 'a'] = kid;
                }
                curr = kid;
            }
            curr.s = word;
        }
        return root;
    }

    void exist1(char[][] board, int i, int j, Trie trie) {
        final Trie kid = trie.kids[board[i][j] - 'a'];
        if (kid != null) {
            if (kid.s != null) {
                result.add(kid.s);
            }
            visited[i][j] = true;
            exist2(board, i + 1, j, kid);
            exist2(board, i - 1, j, kid);
            exist2(board, i, j + 1, kid);
            exist2(board, i, j - 1, kid);
            visited[i][j] = false;
        }
    }

    void exist2(char[][] board, int i, int j, Trie trie) {
        if (i >= 0 && i < N && j >= 0 && j < M && !visited[i][j]) {
            exist1(board, i, j, trie);
        }
    }

}
