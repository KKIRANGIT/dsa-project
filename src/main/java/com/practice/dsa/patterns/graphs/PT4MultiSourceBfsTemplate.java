package com.practice.dsa.patterns.graphs;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Beginner multi-source BFS pattern.
 *
 * Use when shortest distance starts from many initial cells at once.
 */
public class PT4MultiSourceBfsTemplate {
    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int[][] distanceFromSources(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] distance = new int[rows][cols];
        Queue<int[]> queue = new ArrayDeque<>();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 0) {
                    queue.offer(new int[]{row, col});
                } else {
                    distance[row][col] = -1;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];

            for (int[] direction : DIRECTIONS) {
                int nextRow = row + direction[0];
                int nextCol = col + direction[1];

                if (nextRow < 0 || nextCol < 0 || nextRow >= rows || nextCol >= cols || distance[nextRow][nextCol] != -1) {
                    continue;
                }

                distance[nextRow][nextCol] = distance[row][col] + 1;
                queue.offer(new int[]{nextRow, nextCol});
            }
        }

        return distance;
    }
}
