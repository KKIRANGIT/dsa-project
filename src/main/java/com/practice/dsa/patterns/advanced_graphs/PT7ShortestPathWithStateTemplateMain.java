package com.practice.dsa.patterns.advanced_graphs;

public class PT7ShortestPathWithStateTemplateMain {
    public static void main(String[] args) {
        PT7ShortestPathWithStateTemplate template = new PT7ShortestPathWithStateTemplate();
        int[][] graph = {
                {1, 2, 3},
                {0},
                {0},
                {0}
        };
        System.out.println(template.shortestPathVisitAllNodes(graph));
    }
}
