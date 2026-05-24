package com.practice.dsa.problems.advanced_graphs.path_with_minimum_effort;

import java.util.PriorityQueue;

/**
 * LC 1631 - Path With Minimum Effort
 *
 * Beginner idea:
 * The path cost is the maximum edge difference used so far.
 * Dijkstra still works if the state value is "best possible maximum effort to reach this cell".
 */
public class LC1631PathWithMinimumEffortSolver {
    private static final int[][] DIRECTIONS = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        int[][] best = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            java.util.Arrays.fill(best[row], Integer.MAX_VALUE);
        }

        PriorityQueue<State> minHeap = new PriorityQueue<>((first, second) -> Integer.compare(first.effort, second.effort));
        best[0][0] = 0;
        minHeap.offer(new State(0, 0, 0));

        while (!minHeap.isEmpty()) {
            State state = minHeap.poll();
            if (state.row == rows - 1 && state.col == cols - 1) {
                return state.effort;
            }
            if (state.effort > best[state.row][state.col]) {
                continue;
            }

            for (int[] direction : DIRECTIONS) {
                int nextRow = state.row + direction[0];
                int nextCol = state.col + direction[1];
                if (nextRow < 0 || nextCol < 0 || nextRow >= rows || nextCol >= cols) {
                    continue;
                }

                int edgeCost = Math.abs(heights[state.row][state.col] - heights[nextRow][nextCol]);
                int nextEffort = Math.max(state.effort, edgeCost);

                if (nextEffort < best[nextRow][nextCol]) {
                    best[nextRow][nextCol] = nextEffort;
                    minHeap.offer(new State(nextRow, nextCol, nextEffort));
                }
            }
        }

        return 0;
    }

    private static class State {
        private final int row;
        private final int col;
        private final int effort;

        private State(int row, int col, int effort) {
            this.row = row;
            this.col = col;
            this.effort = effort;
        }
    }
}
