package com.leetcode.problems.numberOfConnectedComponentsInAnUndirectedGraph;

/**
 * https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/#/description
 * <p>
 * 323. Number of Connected Components in an Undirected Graph
 *
 * @author Pavel Belevich
 */
public class Solution {

    class UF {

        int[] parent;
        int[] size;
        int count;

        public UF(int count) {
            this.count = count;
            this.parent = new int[count];
            this.size = new int[count];
            for (int i = 0; i < count; i++) {
                this.parent[i] = i;
                this.size[i] = 1;
            }
        }

        void union(int i, int j) {
            int iRoot = find(i);
            int jRoot = find(j);
            if (iRoot != jRoot) {
                if (size[iRoot] > size[jRoot]) {
                    parent[jRoot] = iRoot;
                    size[iRoot] += size[jRoot];
                } else {
                    parent[iRoot] = jRoot;
                    size[jRoot] += size[iRoot];
                }
                count--;
            }
        }

        int find(int p) {
            int root = p;
            while (root != parent[root])
                root = parent[root];
            while (p != root) {
                int newp = parent[p];
                parent[p] = root;
                p = newp;
            }
            return root;
        }

    }

    public int countComponents(int n, int[][] edges) {
        UF uf = new UF(n);
        for (int[] edge : edges) {
            uf.union(edge[0], edge[1]);
        }
        return uf.count;
    }

}
