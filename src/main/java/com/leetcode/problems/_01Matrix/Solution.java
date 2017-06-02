package com.leetcode.problems._01Matrix;

/**
 * 542. 01 Matrix
 *
 * @author Pavel Belevich
 */
public class Solution {

    static class LongList {

        long[] array;
        int size;

        LongList(int cap) {
            this.array = new long[cap];
        }

        void add(long val) {
            this.array[size++] = val;
        }

        void clear() {
            size = 0;
        }

        boolean isEmpty() {
            return size == 0;
        }

    }

    private final static int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int[][] updateMatrix(int[][] matrix) {
        final int n = matrix.length;
        final int m = matrix[0].length;

        int[][] result = new int[n][m];

        LongList coll = new LongList(n * m);
        LongList coll2 = new LongList(n * m);
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    coll.add(p(i, j));
                    visited[i][j] = true;
                }
            }
        }

        for (int z = 1; !coll.isEmpty(); z++) {
            coll2.clear();
            for (int k = 0; k < coll.size; k++) {
                long p = coll.array[k];
                int i = x(p);
                int j = y(p);
                for (int[] dir : directions) {
                    int i1 = i + dir[0];
                    int j1 = j + dir[1];
                    if (i1 >= 0 && i1 < n && j1 >= 0 && j1 < m && !visited[i1][j1]) {
                        result[i1][j1] = z;
                        coll2.add(p(i1, j1));
                        visited[i1][j1] = true;
                    }
                }
            }
            LongList temp = coll;
            coll = coll2;
            coll2 = temp;
        }

        return result;
    }

    static long p(int x, int y) {
        return (((long) x) & 0xffffffffL) | (((long) y) << 32);
    }

    static int x(long p) {
        return (int) (p & 0xffffffffL);
    }

    static int y(long p) {
        return (int) ((p >> 32) & 0xffffffffL);
    }

}
