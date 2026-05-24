package com.practice.dsa.problems.graphs.shortest_path_in_binary_matrix;

public class LC1091ShortestPathInBinaryMatrixMain {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 1},
                {1, 0}
        };

        System.out.println("LC1091 = " + new LC1091ShortestPathInBinaryMatrixSolver().shortestPathBinaryMatrix(grid));
    }
}
