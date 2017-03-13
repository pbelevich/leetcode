package com.leetcode.problems.courseScheduleII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * https://leetcode.com/problems/course-schedule-ii/
 * <p>
 * 210. Course Schedule II
 * <p>
 * There are a total of n courses you have to take, labeled from 0 to n - 1.
 * <p>
 * Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
 * <p>
 * Given the total number of courses and a list of prerequisite pairs, return the ordering of courses you should take to finish all courses.
 * <p>
 * There may be multiple correct orders, you just need to return one of them. If it is impossible to finish all courses, return an empty array.
 * <p>
 * For example:
 * <p>
 * 2, [[1,0]]
 * There are a total of 2 courses to take. To take course 1 you should have finished course 0. So the correct course order is [0,1]
 * <p>
 * 4, [[1,0],[2,0],[3,1],[3,2]]
 * There are a total of 4 courses to take. To take course 3 you should have finished both courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0. So one correct course order is [0,1,2,3]. Another correct ordering is[0,2,1,3].
 *
 * @author Pavel Belevich
 */
public class Solution {

    private Collection<Integer>[] adj;
    private int[] order;
    private int top;
    private boolean[] visited;
    private boolean[] stack;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        adj = new Collection[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : prerequisites) {
            adj[edge[0]].add(edge[1]);
        }

        order = new int[numCourses];
        top = 0;
        visited = new boolean[numCourses];
        stack = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                Arrays.fill(stack, false);
                if (!topologicalSort(i)) {
                    return new int[0];
                }
            }
        }

        return order;
    }

    boolean topologicalSort(int i) {
        if (stack[i]) {
            return false;
        }
        stack[i] = true;
        for (int j : adj[i]) {
            if (!visited[j]) {
                if (!topologicalSort(j)) {
                    return false;
                }
            }
        }
        visited[i] = true;
        order[top++] = i;
        stack[i] = false;
        return true;
    }

}
