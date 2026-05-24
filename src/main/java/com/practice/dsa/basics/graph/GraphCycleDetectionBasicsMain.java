package com.practice.dsa.basics.graph;

import com.practice.dsa.common.StructureBuilder;

import java.util.List;

public class GraphCycleDetectionBasicsMain {
    public static void main(String[] args) {
        List<List<Integer>> graph = StructureBuilder.buildUndirectedGraph(
                4,
                new int[][]{
                        {0, 1},
                        {1, 2},
                        {2, 0},
                        {2, 3}
                }
        );

        System.out.println("has cycle = " + new GraphCycleDetectionBasics().hasCycle(graph));
    }
}
