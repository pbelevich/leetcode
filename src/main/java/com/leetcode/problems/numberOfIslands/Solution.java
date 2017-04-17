package com.leetcode.problems.numberOfIslands;

/**
 * https://leetcode.com/problems/number-of-islands/#/description
 * <p>
 * 200. Number of Islands
 * <p>
 * Given parent 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * <p>
 * Example 1:
 * <p>
 * 11110
 * 11010
 * 11000
 * 00000
 * Answer: 1
 * <p>
 * Example 2:
 * <p>
 * 11000
 * 11000
 * 00100
 * 00011
 * Answer: 3
 *
 * @author Pavel Belevich
 */
public class Solution {

    private static final char ONE = '1';

    private char[][] grid;
    private int n;
    private int m;
    private int[] parent;
    private int[] size;
    private int count;


    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length;
        this.count = n * m;
        this.parent = new int[count];
        this.size = new int[count];
        for (int i = 0; i < count; i++) {
            this.parent[i] = i;
            this.size[i] = 1;
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (grid(r, c) == ONE) {
                    if (grid(r + 1, c) == ONE) {
                        union(id(r, c), id(r + 1, c));
                    }
                    if (grid(r, c + 1) == ONE) {
                        union(id(r, c), id(r, c + 1));
                    }
                } else {
                    count--;
                }
            }
        }
        return count;
    }

    private char grid(int r, int c) {
        if (r >= 0 && r < n && c >= 0 && c < m) {
            return grid[r][c];
        }
        return 0;
    }

    private int id(int i, int j) {
        return i * m + j;
    }

    private void union(int i, int j) {
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
            count--;
        }
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
