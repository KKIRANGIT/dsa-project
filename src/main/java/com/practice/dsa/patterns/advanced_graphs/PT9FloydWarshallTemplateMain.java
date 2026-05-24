package com.practice.dsa.patterns.advanced_graphs;

import java.util.Arrays;

public class PT9FloydWarshallTemplateMain {
    public static void main(String[] args) {
        PT9FloydWarshallTemplate template = new PT9FloydWarshallTemplate();
        int[][] edges = {
                {0, 1, 3},
                {1, 2, 4},
                {0, 2, 10}
        };
        System.out.println(Arrays.deepToString(template.allPairsShortestPath(3, edges)));
    }
}
