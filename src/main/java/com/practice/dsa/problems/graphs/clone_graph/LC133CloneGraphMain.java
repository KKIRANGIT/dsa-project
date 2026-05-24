package com.practice.dsa.problems.graphs.clone_graph;

import com.practice.dsa.common.GraphNode;

public class LC133CloneGraphMain {
    public static void main(String[] args) {
        // Build a tiny graph with two connected nodes.
        GraphNode one = new GraphNode(1);
        GraphNode two = new GraphNode(2);
        one.neighbors.add(two);
        two.neighbors.add(one);

        // Clone the graph.
        GraphNode clone = new LC133CloneGraphSolver().cloneGraph(one);
        // Print cloned node values.
        System.out.println(clone.val + " -> " + clone.neighbors.get(0).val);
    }
}
