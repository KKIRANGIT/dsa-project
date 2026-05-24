package com.practice.dsa.patterns.graphs;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Beginner matrix BFS pattern.
 *
 * Useful when moving in four directions on a grid.
 */
public class PT3MatrixBfsTemplate {
    private static final int[][] DIRECTIONS = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    public int shortestPathToTarget(int[][] grid, int target) {
        // Queue stores row, col, distance.
        Queue<int[]> queue = new ArrayDeque<>();
        // seen prevents revisiting cells.
        boolean[][] seen = new boolean[grid.length][grid[0].length];

        // Start from top-left cell with distance 0.
        queue.offer(new int[]{0, 0, 0});
        seen[0][0] = true;

        while (!queue.isEmpty()) {
            // Read next BFS state.
            int[] state = queue.poll();
            int row = state[0];
            int col = state[1];
            int distance = state[2];

            // Return first time target is reached.
            if (grid[row][col] == target) {
                return distance;
            }

            for (int[] direction : DIRECTIONS) {
                int nextRow = row + direction[0];
                int nextCol = col + direction[1];

                if (nextRow < 0 || nextCol < 0 || nextRow >= grid.length || nextCol >= grid[0].length) {
                    continue;
                }
                if (seen[nextRow][nextCol]) {
                    continue;
                }

                // Mark cell before pushing to queue.
                seen[nextRow][nextCol] = true;
                queue.offer(new int[]{nextRow, nextCol, distance + 1});
            }
        }

        return -1;
    }
}
