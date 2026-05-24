package com.practice.dsa.patterns.advanced_graphs;

public class PT3PrimTemplateMain {
    public static void main(String[] args) {
        PT3PrimTemplate template = new PT3PrimTemplate();
        int[][] edges = {
                {0, 1, 1},
                {1, 2, 2},
                {0, 2, 4}
        };
        System.out.println(template.minimumSpanningTreeCost(3, edges));
    }
}
