package com.practice.dsa.patterns.graphs;

import java.util.List;
import java.util.Map;

public class PT2GraphBfsTemplateMain {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = Map.of(1, List.of(2, 3), 2, List.of(4), 3, List.of(), 4, List.of());
        PT2GraphBfsTemplate template = new PT2GraphBfsTemplate();
        System.out.println(template.traverse(graph, 1));
    }
}
