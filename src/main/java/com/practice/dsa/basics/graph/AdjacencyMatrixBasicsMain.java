package com.practice.dsa.basics.graph;

import java.util.Arrays;

public class AdjacencyMatrixBasicsMain {
    public static void main(String[] args) {
        AdjacencyMatrixBasics basics = new AdjacencyMatrixBasics();
        int[][] matrix = basics.buildUndirectedMatrix(
                4,
                new int[][]{
                        {0, 1},
                        {1, 2},
                        {2, 3}
                }
        );

        System.out.println("matrix = " + Arrays.deepToString(matrix));
        System.out.println("hasEdge(1,2) = " + basics.hasEdge(matrix, 1, 2));
        System.out.println("hasEdge(0,3) = " + basics.hasEdge(matrix, 0, 3));
    }
}
