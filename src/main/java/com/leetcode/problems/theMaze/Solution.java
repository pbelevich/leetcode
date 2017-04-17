package com.leetcode.problems.theMaze;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/the-maze/#/description
 * <p>
 * 490. The Maze
 *
 * @author Pavel Belevich
 */
public class Solution {

    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private int[][] maze;
    private int[][][][] borders;

    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        this.maze = maze;
        this.borders = new int[maze.length][maze[0].length][4][];
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(start);
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        while (!queue.isEmpty()) {
            final int[] pos = queue.poll();
            if (pos[0] == destination[0] && pos[1] == destination[1]) {
                return true;
            }
            visited[pos[0]][pos[1]] = true;
            for (int[] direction : DIRECTIONS) {
                final int[] border = border(pos, direction);
                if (!visited[border[0]][border[1]]) {
                    queue.offer(border);
                }
            }
        }
        return false;
    }

    private int maze(int r, int c) {
        if (r >= 0 && r < maze.length && c >= 0 && c < maze[r].length) {
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
