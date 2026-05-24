package com.practice.dsa.problems.graphs.pacific_atlantic_water_flow;

import java.util.ArrayList;
import java.util.List;

/**
 * LC 417 - Pacific Atlantic Water Flow
 *
 * Beginner idea:
 * Reverse the direction of thinking.
 * Instead of flowing from each cell to oceans, start DFS from ocean borders inward.
 */
public class LC417PacificAtlanticWaterFlowSolver {
    private static final int[][] DIRECTIONS = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        for (int row = 0; row < rows; row++) {
            dfs(heights, row, 0, pacific);
            dfs(heights, row, cols - 1, atlantic);
        }
        for (int col = 0; col < cols; col++) {
            dfs(heights, 0, col, pacific);
            dfs(heights, rows - 1, col, atlantic);
        }

        List<List<Integer>> answer = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (pacific[row][col] && atlantic[row][col]) {
                    answer.add(List.of(row, col));
                }
            }
        }
        return answer;
    }

    private void dfs(int[][] heights, int row, int col, boolean[][] visited) {
        if (visited[row][col]) {
            return;
        }
        visited[row][col] = true;

        for (int[] direction : DIRECTIONS) {
            int nextRow = row + direction[0];
            int nextCol = col + direction[1];
            if (nextRow < 0 || nextCol < 0 || nextRow >= heights.length || nextCol >= heights[0].length) {
                continue;
            }
            if (heights[nextRow][nextCol] < heights[row][col]) {
                continue;
            }
            dfs(heights, nextRow, nextCol, visited);
        }
    }
}
