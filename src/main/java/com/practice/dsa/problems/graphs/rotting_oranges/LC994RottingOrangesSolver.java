package com.practice.dsa.problems.graphs.rotting_oranges;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * LC 994 - Rotting Oranges
 *
 * Beginner idea:
 * Multi-source BFS starts from all rotten oranges at once.
 */
public class LC994RottingOrangesSolver {
    private static final int[][] DIRECTIONS = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();
        int fresh = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 2) {
                    queue.offer(new int[]{row, col});
                } else if (grid[row][col] == 1) {
                    fresh++;
                }
            }
        }

        int minutes = 0;
        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            for (int count = 0; count < size; count++) {
                int[] cell = queue.poll();
                int row = cell[0];
                int col = cell[1];

                for (int[] direction : DIRECTIONS) {
                    int nextRow = row + direction[0];
                    int nextCol = col + direction[1];
                    if (nextRow < 0 || nextCol < 0 || nextRow >= grid.length || nextCol >= grid[0].length) {
                        continue;
                    }
                    if (grid[nextRow][nextCol] != 1) {
                        continue;
                    }

                    grid[nextRow][nextCol] = 2;
                    fresh--;
                    queue.offer(new int[]{nextRow, nextCol});
                }
            }
            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}
