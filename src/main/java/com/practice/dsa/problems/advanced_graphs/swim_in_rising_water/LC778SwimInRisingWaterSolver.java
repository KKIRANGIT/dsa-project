package com.practice.dsa.problems.advanced_graphs.swim_in_rising_water;

import java.util.PriorityQueue;

/**
 * LC 778 - Swim in Rising Water
 *
 * Beginner idea:
 * We want a path that minimizes the maximum elevation we must wait for.
 * Dijkstra fits because we keep expanding the currently best possible cell.
 */
public class LC778SwimInRisingWaterSolver {
    private static final int[][] DIRECTIONS = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    public int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        PriorityQueue<State> minHeap = new PriorityQueue<>((first, second) -> Integer.compare(first.time, second.time));
        minHeap.offer(new State(0, 0, grid[0][0]));

        while (!minHeap.isEmpty()) {
            State state = minHeap.poll();

            if (visited[state.row][state.col]) {
                continue;
            }
            visited[state.row][state.col] = true;

            if (state.row == n - 1 && state.col == n - 1) {
                return state.time;
            }

            for (int[] direction : DIRECTIONS) {
                int nextRow = state.row + direction[0];
                int nextCol = state.col + direction[1];
                if (nextRow < 0 || nextCol < 0 || nextRow >= n || nextCol >= n || visited[nextRow][nextCol]) {
                    continue;
                }

                int nextTime = Math.max(state.time, grid[nextRow][nextCol]);
                minHeap.offer(new State(nextRow, nextCol, nextTime));
            }
        }

        return -1;
    }

    private static class State {
        private final int row;
        private final int col;
        private final int time;

        private State(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }
}
