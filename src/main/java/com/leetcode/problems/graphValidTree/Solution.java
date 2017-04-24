package com.leetcode.problems.graphValidTree;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/graph-valid-tree/#/description
 * <p>
 * 261. Graph Valid Tree
 *
 * @author Pavel Belevich
 */
public class Solution {

    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) {
            return false;
        }
        int[] a = new int[n];
        Arrays.fill(a, -1);
        for (int[] edge : edges) {
            final int x = find(a, edge[0]);
            final int y = find(a, edge[1]);
            if (x == y) {
                return false;
            } else {
                a[x] = y;
            }
        }
        return true;
    }

    int find(int[] a, int i) {
        while (a[i] != -1) {
            i = a[i];
        }
        return i;
    }

}
