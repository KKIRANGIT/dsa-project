package com.practice.dsa.basics.graph;

import com.practice.dsa.common.GraphPrinter;

import java.util.List;
import java.util.Map;

public class GraphTraversalMain {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = Map.of(
                1, List.of(2, 3),
                2, List.of(4),
                3, List.of(4),
                4, List.of()
        );

        GraphTraversal traversal = new GraphTraversal();
        System.out.println(GraphPrinter.adjacencyList(graph));
        System.out.println("bfs = " + traversal.bfs(graph, 1));
        System.out.println("dfs = " + traversal.dfs(graph, 1));
    }
}
