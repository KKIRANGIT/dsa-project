package com.practice.dsa.patterns.advanced_graphs;

public class PT5TarjanSccTemplateMain {
    public static void main(String[] args) {
        PT5TarjanSccTemplate template = new PT5TarjanSccTemplate();
        int[][] edges = {
                {0, 1}, {1, 2}, {2, 0}, {1, 3}, {3, 4}
        };
        System.out.println(template.stronglyConnectedComponents(5, edges));
    }
}
