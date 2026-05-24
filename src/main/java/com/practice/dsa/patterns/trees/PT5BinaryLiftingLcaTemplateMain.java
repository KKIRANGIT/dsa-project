package com.practice.dsa.patterns.trees;

public class PT5BinaryLiftingLcaTemplateMain {
    public static void main(String[] args) {
        PT5BinaryLiftingLcaTemplate template = new PT5BinaryLiftingLcaTemplate();
        int[][] edges = {
                {0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}
        };
        template.build(7, edges, 0);
        System.out.println(template.lca(3, 4));
        System.out.println(template.lca(3, 5));
    }
}
