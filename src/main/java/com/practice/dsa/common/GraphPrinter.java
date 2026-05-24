package com.practice.dsa.common;

import java.util.List;
import java.util.Map;

public final class GraphPrinter {
    private GraphPrinter() {
    }

    public static String adjacencyList(Map<Integer, List<Integer>> graph) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            builder.append(entry.getKey())
                    .append(" -> ")
                    .append(entry.getValue())
                    .append(System.lineSeparator());
        }
        return builder.toString();
    }

    public static String adjacencyList(List<List<Integer>> graph) {
        StringBuilder builder = new StringBuilder();
        for (int node = 0; node < graph.size(); node++) {
            builder.append(node)
                    .append(" -> ")
                    .append(graph.get(node))
                    .append(System.lineSeparator());
        }
        return builder.toString();
    }

    public static String weightedAdjacencyList(List<List<Edge>> graph) {
        StringBuilder builder = new StringBuilder();
        for (int node = 0; node < graph.size(); node++) {
            builder.append(node).append(" -> [");

            List<Edge> edges = graph.get(node);
            for (int index = 0; index < edges.size(); index++) {
                Edge edge = edges.get(index);
                builder.append("(")
                        .append(edge.to)
                        .append(", w=")
                        .append(edge.weight)
                        .append(")");
                if (index < edges.size() - 1) {
                    builder.append(", ");
                }
            }

            builder.append("]").append(System.lineSeparator());
        }
        return builder.toString();
    }
}
