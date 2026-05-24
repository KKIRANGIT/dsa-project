package com.practice.dsa.patterns.graphs;

public class PT7BipartiteCheckTemplateMain {
    public static void main(String[] args) {
        PT7BipartiteCheckTemplate template = new PT7BipartiteCheckTemplate();
        int[][] graph = {
                {1, 3},
                {0, 2},
                {1, 3},
                {0, 2}
        };
        System.out.println(template.isBipartite(graph));
    }
}
