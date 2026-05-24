package com.practice.dsa.basics.graph;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Beginner grid shortest-path reference.
 *
 * BFS works here because every move has equal cost.
 *
 * The queue stores:
 * - row
 * - column
 * - distance from the start
 */
public class GridShortestPathBasics {
    private static final int[][] DIRECTIONS = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
    };

    public int shortestPath(int[][] grid) {
        if (grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1) {
            // If start or finish is blocked, no path can exist.
            return -1;
        }

        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        queue.offer(new int[]{0, 0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            // Remove the earliest discovered state first.
            // That is why the first time we reach the target,
            // the distance is guaranteed to be shortest.
            int[] state = queue.poll();
            int row = state[0];
            int col = state[1];
            int distance = state[2];

            if (row == grid.length - 1 && col == grid[0].length - 1) {
                return distance;
            }

            for (int[] direction : DIRECTIONS) {
                int nextRow = row + direction[0];
                int nextCol = col + direction[1];

                // Ignore positions outside the grid.
                if (nextRow < 0 || nextRow >= grid.length || nextCol < 0 || nextCol >= grid[0].length) {
                    continue;
                }
                // Ignore blocked cells and cells already processed earlier.
                if (grid[nextRow][nextCol] == 1 || visited[nextRow][nextCol]) {
                    continue;
                }

                visited[nextRow][nextCol] = true;
                // Next layer is always one move farther away.
                queue.offer(new int[]{nextRow, nextCol, distance + 1});
            }
        }

        // Queue became empty before reaching the target.
        return -1;
    }
}
