package com.practice.dsa.patterns.graphs;

public class PT8BridgeFindingTemplateMain {
    public static void main(String[] args) {
        PT8BridgeFindingTemplate template = new PT8BridgeFindingTemplate();
        int[][] edges = {
                {0, 1}, {1, 2}, {2, 0}, {1, 3}
        };
        System.out.println(template.findBridges(4, edges));
    }
}
