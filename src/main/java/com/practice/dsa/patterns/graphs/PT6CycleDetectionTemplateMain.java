package com.practice.dsa.patterns.graphs;

import java.util.List;
import java.util.Map;

public class PT6CycleDetectionTemplateMain {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = Map.of(1, List.of(2), 2, List.of(3), 3, List.of(1));
        PT6CycleDetectionTemplate template = new PT6CycleDetectionTemplate();
        System.out.println(template.hasCycle(graph));
    }
}
