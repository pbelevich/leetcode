package com.leetcode.problems.cloneGraph;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void cloneGraph() throws Exception {
        UndirectedGraphNode node1 = new UndirectedGraphNode(1);
        UndirectedGraphNode node2 = new UndirectedGraphNode(2);
        UndirectedGraphNode node3 = new UndirectedGraphNode(3);
        UndirectedGraphNode node4 = new UndirectedGraphNode(4);
        node1.neighbors.add(node2);
        node2.neighbors.add(node1);
        node1.neighbors.add(node3);
        node3.neighbors.add(node1);
        node4.neighbors.add(node2);
        node2.neighbors.add(node4);
        node4.neighbors.add(node3);
        node3.neighbors.add(node4);
        UndirectedGraphNode clone1 = SOLUTION.cloneGraph(node1);
    }

}