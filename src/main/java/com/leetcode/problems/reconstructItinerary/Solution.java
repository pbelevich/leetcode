package com.leetcode.problems.reconstructItinerary;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/reconstruct-itinerary/#/description
 * <p>
 * 332. Reconstruct Itinerary
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<String> findItinerary(String[][] tickets) {
        Map<String, Queue<String>> map = new HashMap<>();
        for (String[] ticket : tickets) {
            Queue<String> queue = map.computeIfAbsent(ticket[0], k -> new PriorityQueue<>());
            queue.offer(ticket[1]);
        }
        LinkedList<String> result = new LinkedList<>();
        dfs(map, "JFK", result);
        return result;
    }

    private void dfs(Map<String, Queue<String>> map, String s, LinkedList<String> result) {
        Queue<String> q = map.get(s);
        while (q != null && !q.isEmpty()) {
            dfs(map, q.poll(), result);
        }
        result.addFirst(s);
    }

}
