package com.practice.dsa.problems.graphs.walls_and_gates;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * LC 286 - Walls and Gates
 *
 * Beginner idea:
 * Start BFS from every gate at the same time.
 * This multi-source BFS fills each room with its shortest distance to any gate.
 */
public class LC286WallsAndGatesSolver {
    private static final int[][] DIRECTIONS = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    public void wallsAndGates(int[][] rooms) {
        Queue<int[]> queue = new ArrayDeque<>();

        for (int row = 0; row < rooms.length; row++) {
            for (int col = 0; col < rooms[0].length; col++) {
                if (rooms[row][col] == 0) {
                    queue.offer(new int[]{row, col});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];

            for (int[] direction : DIRECTIONS) {
                int nextRow = row + direction[0];
                int nextCol = col + direction[1];
                if (nextRow < 0 || nextCol < 0 || nextRow >= rooms.length || nextCol >= rooms[0].length) {
                    continue;
                }
                if (rooms[nextRow][nextCol] != Integer.MAX_VALUE) {
                    continue;
                }

                rooms[nextRow][nextCol] = rooms[row][col] + 1;
                queue.offer(new int[]{nextRow, nextCol});
            }
        }
    }
}
