package com.leetcode.problems.minimumHeightTrees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/minimum-height-trees/#/description
 * <p>
 * 310. Minimum Height Trees
 * <p>
 * For a undirected graph with tree characteristics, we can choose any node as the root. The result graph is then a rooted tree. Among all possible rooted trees, those with minimum height are called minimum height trees (MHTs). Given such a graph, write a function to find all the MHTs and return a list of their root labels.
 * <p>
 * Format
 * The graph contains n nodes which are labeled from 0 to n - 1. You will be given the number n and a list of undirected edges (each edge is a pair of labels).
 * <p>
 * You can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together in edges.
 * <p>
 * Example 1:
 * <p>
 * Given n = 4, edges = [[1, 0], [1, 2], [1, 3]]
 * <p>
 * 0
 * |
 * 1
 * / \
 * 2   3
 * return [1]
 * <p>
 * Example 2:
 * <p>
 * Given n = 6, edges = [[0, 3], [1, 3], [2, 3], [4, 3], [5, 4]]
 * <p>
 * 0  1  2
 * \ | /
 * 3
 * |
 * 4
 * |
 * 5
 * return [3, 4]
 *
 * @author Pavel Belevich
 */
public class Solution {

    static class Key {

        int v;
        int e;

        Key(int v, int e) {
            this.v = v;
            this.e = e;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Key key = (Key) o;

            if (v != key.v) return false;
            return e == key.e;
        }

        @Override
        public int hashCode() {
            int result = v;
            result = 31 * result + e;
            return result;
        }

    }

    private Collection<Integer>[] adj;
    private Map<Key, Integer> cache;

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        this.adj = new Collection[n];
        for (int v = 0; v < n; v++) {
            this.adj[v] = new ArrayList<>(2);
        }
        for (int[] edge : edges) {
            this.adj[edge[0]].add(edge[1]);
            this.adj[edge[1]].add(edge[0]);
        }
        this.cache = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int v = 0; v < n; v++) {
            int h = height(v, v);
            if (h < min) {
                result = new ArrayList<>();
                result.add(v);
                min = h;
            } else if (h == min) {
                result.add(v);
            }
        }
        return result;
    }

    int height(int v, int e) {
        return cache.computeIfAbsent(new Key(v, e), k -> {
            int height = 0;
            for (int w : adj[v]) {
                if (w != e) {
                    height = Math.max(height, height(w, v));
                }
            }
            return 1 + height;
        });
    }

}
