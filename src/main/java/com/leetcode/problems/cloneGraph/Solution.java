package com.leetcode.problems.cloneGraph;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/clone-graph/
 *
 * 133. Clone Graph
 *
 * Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.
 *
 * @author Pavel Belevich
 */
public class Solution {

    private Map<Integer, UndirectedGraphNode> map = new HashMap<>();

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }

        UndirectedGraphNode clone = map.get(node.label);
        if (clone == null) {
            clone = new UndirectedGraphNode(node.label);
            map.put(clone.label, clone);
            for (UndirectedGraphNode neighbor : node.neighbors) {
                clone.neighbors.add(cloneGraph(neighbor));
            }
        }
        return clone;
    }

}
