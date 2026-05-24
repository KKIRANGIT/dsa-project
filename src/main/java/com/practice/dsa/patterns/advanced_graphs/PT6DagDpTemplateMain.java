package com.practice.dsa.patterns.advanced_graphs;

public class PT6DagDpTemplateMain {
    public static void main(String[] args) {
        PT6DagDpTemplate template = new PT6DagDpTemplate();
        int[][] edges = {
                {0, 1}, {0, 2}, {1, 3}, {2, 3}, {3, 4}
        };
        System.out.println(template.longestPathLength(5, edges));
    }
}
