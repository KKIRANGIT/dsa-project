package com.practice.dsa.problems.advanced_graphs.reconstruct_itinerary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * LC 332 - Reconstruct Itinerary
 *
 * Beginner idea:
 * We need to use every flight exactly once.
 * That is an Eulerian-path style problem.
 * Use Hierholzer's algorithm and always take the smallest lexical airport first.
 */
public class LC332ReconstructItinerarySolver {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        for (List<String> ticket : tickets) {
            graph.computeIfAbsent(ticket.get(0), unused -> new PriorityQueue<>()).offer(ticket.get(1));
        }

        LinkedList<String> route = new LinkedList<>();
        dfs("JFK", graph, route);
        return route;
    }

    private void dfs(String airport, Map<String, PriorityQueue<String>> graph, LinkedList<String> route) {
        PriorityQueue<String> nextStops = graph.get(airport);

        while (nextStops != null && !nextStops.isEmpty()) {
            dfs(nextStops.poll(), graph, route);
        }

        route.addFirst(airport);
    }
}
