package com.leetcode.problems.numberOfIslandsII;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/number-of-islands-ii/#/description
 * <p>
 * 305. Number of Islands II
 *
 * @author Pavel Belevich
 */
public class Solution {

    private static final char ONE = '1';

    private char[][] grid;
    private int m;
    private int n;
    private int[] parent;
    private int[] size;

    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        if (m == 0 || n == 0 || positions == null || positions.length == 0){
            return Collections.emptyList();
        }
        this.grid = new char[m][n];
        this.m = grid.length;
        this.n = grid[0].length;
        int count = n * m;
        this.parent = new int[count];
        this.size = new int[count];
        for (int i = 0; i < count; i++) {
            this.parent[i] = i;
            this.size[i] = 1;
        }

        List<Integer> result = new ArrayList<>(positions.length);
        int islands = 0;
        for (int[] p : positions) {
            islands++;
            int r = p[0];
            int c = p[1];
            grid[r][c] = ONE;
            if (grid(r + 1, c) == ONE) {
                if (union(id(r, c), id(r + 1, c))) {
                    islands--;
                }
            }
            if (grid(r - 1, c) == ONE) {
                if (union(id(r, c), id(r - 1, c))) {
                    islands--;
                }
            }
            if (grid(r, c + 1) == ONE) {
                if (union(id(r, c), id(r, c + 1))) {
                    islands--;
                }
            }
            if (grid(r, c - 1) == ONE) {
                if (union(id(r, c), id(r, c - 1))) {
                    islands--;
                }
            }
            result.add(islands);
        }
        return result;
    }

    private char grid(int r, int c) {
        if (r >= 0 && r < m && c >= 0 && c < n) {
            return grid[r][c];
        }
        return 0;
    }

    private int id(int i, int j) {
        return i * n + j;
    }

    private boolean union(int i, int j) {
        if (!connected(i, j)) {
            final int rootI = find(i);
            final int rootJ = find(j);
            if (size[rootI] < size[rootJ]) {
                parent[rootI] = rootJ;
                size[rootJ] += size[rootI];
            } else {
                parent[rootJ] = rootI;
                size[rootI] += size[rootJ];
            }
            return true;
        }
        return false;
    }

    private boolean connected(int i, int j) {
        return find(i) == find(j);
    }

    private int find(int i) {
        while (parent[i] != i) {
            i = parent[i];
        }
        return i;
    }

}
