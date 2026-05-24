package com.practice.dsa.problems.graphs.clone_graph;

import com.practice.dsa.common.GraphNode;

import java.util.HashMap;
import java.util.Map;

/**
 * LC 133 - Clone Graph
 *
 * Beginner idea:
 * Graphs can have cycles, so we must remember already-cloned nodes.
 * copies maps original node -> cloned node.
 */
public class LC133CloneGraphSolver {
    public GraphNode cloneGraph(GraphNode node) {
        if (node == null) {
            return null;
        }
        return clone(node, new HashMap<>());
    }

    private GraphNode clone(GraphNode node, Map<GraphNode, GraphNode> copies) {
        if (copies.containsKey(node)) {
            return copies.get(node);
        }

        // Create clone first, before cloning neighbors.
        GraphNode copy = new GraphNode(node.val);
        copies.put(node, copy);

        for (GraphNode neighbor : node.neighbors) {
            copy.neighbors.add(clone(neighbor, copies));
        }

        return copy;
    }
}
