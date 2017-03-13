package com.leetcode.problems.courseSchedule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * https://leetcode.com/problems/course-schedule/
 * <p>
 * 207. Course Schedule
 * <p>
 * There are a total of n courses you have to take, labeled from 0 to n - 1.
 * <p>
 * Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
 * <p>
 * Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
 * <p>
 * For example:
 * <p>
 * 2, [[1,0]]
 * There are a total of 2 courses to take. To take course 1 you should have finished course 0. So it is possible.
 * <p>
 * 2, [[1,0],[0,1]]
 * There are a total of 2 courses to take. To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 *
 * @author Pavel Belevich
 */
public class Solution {

    private Collection<Integer>[] adj;
    private boolean[] visited;
    private boolean[] stack;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        adj = new Collection[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : prerequisites) {
            adj[edge[0]].add(edge[1]);
        }

        visited = new boolean[numCourses];
        stack = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                Arrays.fill(stack, false);
                if (!dfs(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean dfs(int i) {
        if (stack[i]) {
            return false;
        }
        if (visited[i]) {
            return true;
        }
        visited[i] = true;
        stack[i] = true;
        for (int j : adj[i]) {
            if (!dfs(j)) {
                return false;
            }
        }
        stack[i] = false;
        return true;
    }

}
