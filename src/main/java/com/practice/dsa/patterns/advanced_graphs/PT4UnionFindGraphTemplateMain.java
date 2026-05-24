package com.practice.dsa.patterns.advanced_graphs;

public class PT4UnionFindGraphTemplateMain {
    public static void main(String[] args) {
        PT4UnionFindGraphTemplate template = new PT4UnionFindGraphTemplate();
        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 0}
        };
        System.out.println(template.edgeCreatesCycle(4, edges));
    }
}
