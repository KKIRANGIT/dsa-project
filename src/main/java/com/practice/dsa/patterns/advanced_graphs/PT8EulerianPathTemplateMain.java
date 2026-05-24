package com.practice.dsa.patterns.advanced_graphs;

public class PT8EulerianPathTemplateMain {
    public static void main(String[] args) {
        PT8EulerianPathTemplate template = new PT8EulerianPathTemplate();
        int[][] edges = {
                {1, 2},
                {2, 3},
                {3, 1}
        };
        System.out.println(template.path(edges, 1));
    }
}
