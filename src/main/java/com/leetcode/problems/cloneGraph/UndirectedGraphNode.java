package com.leetcode.problems.cloneGraph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class UndirectedGraphNode {

    int label;
    List<UndirectedGraphNode> neighbors;

    UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }

    @Override
    public String toString() {
        return "UndirectedGraphNode{" +
                "label=" + label +
                '}';
    }

}
