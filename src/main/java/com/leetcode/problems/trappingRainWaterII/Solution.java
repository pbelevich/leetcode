package com.leetcode.problems.trappingRainWaterII;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/trapping-rain-water-ii/#/solutions
 * <p>
 * 407. Trapping Rain Water II
 * <p>
 * Given an m x n matrix of positive integers representing the height of each unit cell in a 2D elevation map, compute the volume of water it is able to trap after raining.
 * <p>
 * Note:
 * Both m and n are less than 110. The height of each unit cell is greater than 0 and is less than 20,000.
 * <p>
 * Example:
 * <p>
 * Given the following 3x6 height map:
 * [
 * [1,4,3,1,3,2],
 * [3,2,1,3,2,4],
 * [2,3,3,2,3,1]
 * ]
 * <p>
 * Return 4.
 *
 * @author Pavel Belevich
 */
public class Solution {

    static class Cell {
        final int i;
        final int j;
        final int h;

        public Cell(int i, int j, int h) {
            this.i = i;
            this.j = j;
            this.h = h;
        }

    }

    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length < 3 || heightMap[0].length < 3) {
            return 0;
        }

        final int n = heightMap.length;
        final int m = heightMap[0].length;

        Queue<Cell> queue = new PriorityQueue<>(n * m, new Comparator<Cell>() {
            @Override
            public int compare(Cell o1, Cell o2) {
                return Integer.compare(o1.h, o2.h);
            }
        });

        boolean[][] visited = new boolean[n][m];

        for (int i = 1; i < n - 1; i++) {
            queue.offer(new Cell(i, 0, heightMap[i][0]));
            visited[i][0] = true;
            queue.offer(new Cell(i, m - 1, heightMap[i][m - 1]));
            visited[i][m - 1] = true;
        }

        for (int j = 1; j < m - 1; j++) {
            queue.offer(new Cell(0, j, heightMap[0][j]));
            visited[0][j] = true;
            queue.offer(new Cell(n - 1, j, heightMap[n - 1][j]));
            visited[n - 1][j] = true;
        }
        visited[0][0] = true;
        visited[0][m - 1] = true;
        visited[n - 1][0] = true;
        visited[n - 1][m - 1] = true;

        int result = 0;
        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!queue.isEmpty()) {
            final Cell lowest = queue.poll();
            for (int[] dir : dirs) {
                int i = lowest.i + dir[0];
                int j = lowest.j + dir[1];
                if (i >= 0 && i < n && j >= 0 && j < m && !visited[i][j]) {
                    visited[i][j] = true;
                    final int h = heightMap[i][j];
                    result += Math.max(0, lowest.h - h);
                    queue.offer(new Cell(i, j, Math.max(h, lowest.h)));
                }
            }
        }
        return result;
    }

}
