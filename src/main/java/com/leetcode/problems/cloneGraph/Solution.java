package com.leetcode.problems.cloneGraph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

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

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        queue.offer(node);
        final UndirectedGraphNode result = new UndirectedGraphNode(node.label);
        map.put(node.label, result);
        while (!queue.isEmpty()) {
            UndirectedGraphNode n = queue.poll();
            UndirectedGraphNode clone = map.get(n.label);
            for (UndirectedGraphNode neighbor : n.neighbors) {
                UndirectedGraphNode neighborClone = map.get(neighbor.label);
                if (neighborClone == null) {
                    neighborClone = new UndirectedGraphNode(neighbor.label);
                    map.put(neighbor.label, neighborClone);
                    queue.offer(neighbor);
                }
                clone.neighbors.add(neighborClone);
            }
        }
        return result;
    }

}
