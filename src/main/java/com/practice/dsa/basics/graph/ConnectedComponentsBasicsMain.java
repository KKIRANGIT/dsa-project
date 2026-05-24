package com.practice.dsa.basics.graph;

import com.practice.dsa.common.StructureBuilder;

import java.util.List;

public class ConnectedComponentsBasicsMain {
    public static void main(String[] args) {
        List<List<Integer>> graph = StructureBuilder.buildUndirectedGraph(
                6,
                new int[][]{
                        {0, 1},
                        {1, 2},
                        {3, 4}
                }
        );

        ConnectedComponentsBasics basics = new ConnectedComponentsBasics();
        System.out.println("components = " + basics.countComponents(graph));
    }
}
