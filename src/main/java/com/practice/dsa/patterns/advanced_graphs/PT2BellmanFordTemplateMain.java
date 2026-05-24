package com.practice.dsa.patterns.advanced_graphs;

import com.practice.dsa.common.Edge;

import java.util.Arrays;
import java.util.List;

public class PT2BellmanFordTemplateMain {
    public static void main(String[] args) {
        PT2BellmanFordTemplate template = new PT2BellmanFordTemplate();
        System.out.println(Arrays.toString(template.shortestPaths(4, List.of(
                new Edge(0, 1, 4),
                new Edge(0, 2, 5),
                new Edge(1, 2, -2),
                new Edge(2, 3, 3)
        ), 0)));
    }
}
