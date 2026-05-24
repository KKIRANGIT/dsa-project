package com.practice.dsa.problems.graphs.shortest_path_in_binary_matrix;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * LC 1091 - Shortest Path in Binary Matrix
 *
 * Beginner idea:
 * This is an unweighted shortest path on a grid.
 * BFS is the standard tool for the shortest number of steps in an unweighted graph.
 */
public class LC1091ShortestPathInBinaryMatrixSolver {
    private static final int[][] DIRECTIONS = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1},  {1, 0},  {1, 1}
    };

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] != 0 || grid[n - 1][n - 1] != 0) {
            return -1;
        }

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0, 1});
        grid[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] state = queue.poll();
            int row = state[0];
            int col = state[1];
            int distance = state[2];

            if (row == n - 1 && col == n - 1) {
                return distance;
            }

            for (int[] direction : DIRECTIONS) {
                int nextRow = row + direction[0];
                int nextCol = col + direction[1];
                if (nextRow < 0 || nextCol < 0 || nextRow >= n || nextCol >= n) {
                    continue;
                }
                if (grid[nextRow][nextCol] != 0) {
                    continue;
                }

                grid[nextRow][nextCol] = 1;
                queue.offer(new int[]{nextRow, nextCol, distance + 1});
            }
        }

        return -1;
    }
}
