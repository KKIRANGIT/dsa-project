package com.practice.dsa.common;

import java.util.List;

public class StructureBuilderMain {
    public static void main(String[] args) {
        // Build a linked list from plain integer values.
        ListNode linkedList = StructureBuilder.buildLinkedList(1, 2, 3, 4);
        System.out.println("linked list = " + LinkedListPrinter.stringify(linkedList));

        // Build a binary tree from level-order values.
        TreeNode tree = StructureBuilder.buildTreeLevelOrder(1, 2, 3, 4, 5, null, 7);
        System.out.println("tree = " + TreePrinter.levelOrder(tree));

        // Build a small undirected graph from an edge list.
        List<List<Integer>> graph = StructureBuilder.buildUndirectedGraph(
                5,
                new int[][]{
                        {0, 1},
                        {0, 2},
                        {1, 3},
                        {2, 4}
                }
        );
        System.out.println("graph = " + GraphPrinter.adjacencyList(graph));

        // Build a weighted directed graph for shortest-path style problems.
        List<List<Edge>> weightedGraph = StructureBuilder.buildWeightedDirectedGraph(
                4,
                new int[][]{
                        {0, 1, 4},
                        {0, 2, 1},
                        {2, 1, 2},
                        {1, 3, 1}
                }
        );
        System.out.println("weighted graph = ");
        System.out.println(GraphPrinter.weightedAdjacencyList(weightedGraph));
    }
}
