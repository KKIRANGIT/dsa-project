package com.practice.dsa.patterns.graphs;

import java.util.List;
import java.util.Map;

public class PT1GraphDfsTemplateMain {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = Map.of(1, List.of(2, 3), 2, List.of(4), 3, List.of(), 4, List.of());
        PT1GraphDfsTemplate template = new PT1GraphDfsTemplate();
        System.out.println(template.traverse(graph, 1));
    }
}
