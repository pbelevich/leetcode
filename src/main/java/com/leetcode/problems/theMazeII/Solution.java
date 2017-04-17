package com.leetcode.problems.theMazeII;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/the-maze-ii/#/solutions
 * <p>
 * 505. The Maze II
 *
 * @author Pavel Belevich
 */
public class Solution {

    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private int[][] maze;
    private int n, m;
    private int[][][][] borders;

    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        this.maze = maze;
        this.n = maze.length;
        this.m = maze[0].length;
        this.borders = new int[n][m][4][];

        int[][] length = new int[n][m];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                length[r][c] = Integer.MAX_VALUE;
            }
        }
        length[start[0]][start[1]] = 0;

        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparing(p -> length[p[0]][p[1]]));
        queue.offer(start);

        boolean[][] visited = new boolean[n][m];

        while (!queue.isEmpty()) {
            final int[] pos = queue.poll();
            visited[pos[0]][pos[1]] = true;
            for (int[] direction : DIRECTIONS) {
                final int[] border = border(pos, direction);
                if (!visited[border[0]][border[1]]) {
                    final int newLength = length[pos[0]][pos[1]] + length(border, pos);
                    if (newLength < length[border[0]][border[1]]) {
                        length[border[0]][border[1]] = newLength;
                        queue.offer(border);
                    }
                }
            }
        }

        int result = length[destination[0]][destination[1]];
        if (result == Integer.MAX_VALUE) {
            result = -1;
        }
        return result;
    }

    private int length(int[] a, int[] b) {
        if (a[0] == b[0]) {
            return Math.abs(b[1] - a[1]);
        } else {
            return Math.abs(b[0] - a[0]);
        }
    }

    private int maze(int r, int c) {
        if (r >= 0 && r < n && c >= 0 && c < m) {
            return maze[r][c];
        }
        return 1;
    }

    private int[] border(int[] pos, int[] direction) {
        final int dir = direction(direction);
        if (borders[pos[0]][pos[1]][dir] == null) {
            int[] res = new int[]{pos[0], pos[1]};
            while (maze(res[0] + direction[0], res[1] + direction[1]) != 1) {
                res[0] += direction[0];
                res[1] += direction[1];
            }
            borders[pos[0]][pos[1]][dir] = res;
        }
        return borders[pos[0]][pos[1]][dir];
    }

    private int direction(int[] direction) {
        if (direction == DIRECTIONS[0]) {
            return 0;
        } else if (direction == DIRECTIONS[1]) {
            return 1;
        } else if (direction == DIRECTIONS[2]) {
            return 2;
        } else if (direction == DIRECTIONS[3]) {
            return 3;
        } else {
            return -1;
        }
    }

}
