package com.practice.dsa.problems.graphs;

import com.practice.dsa.problems.graphs.course_schedule.LC207CourseScheduleSolver;
import com.practice.dsa.problems.graphs.max_area_of_island.LC695MaxAreaOfIslandSolver;
import com.practice.dsa.problems.graphs.number_of_islands.LC200NumberOfIslandsSolver;
import com.practice.dsa.problems.graphs.pacific_atlantic_water_flow.LC417PacificAtlanticWaterFlowSolver;
import com.practice.dsa.problems.graphs.rotting_oranges.LC994RottingOrangesSolver;
import com.practice.dsa.problems.graphs.shortest_path_in_binary_matrix.LC1091ShortestPathInBinaryMatrixSolver;
import com.practice.dsa.problems.graphs.surrounded_regions.LC130SurroundedRegionsSolver;
import com.practice.dsa.problems.graphs.walls_and_gates.LC286WallsAndGatesSolver;

import java.util.Arrays;

public class GraphsProblemsMain {
    public static void main(String[] args) {
        // Build island grid.
        char[][] islands = {
                {'1', '1', '0'},
                {'0', '1', '0'},
                {'1', '0', '1'}
        };
        // Run number-of-islands sample.
        System.out.println("LC200 = " + new LC200NumberOfIslandsSolver().numIslands(islands));

        // Build integer grid for island area.
        int[][] areaGrid = {
                {0, 0, 1, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0}
        };
        // Run max-area-of-island sample.
        System.out.println("LC695 = " + new LC695MaxAreaOfIslandSolver().maxAreaOfIsland(areaGrid));

        int[][] oranges = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        System.out.println("LC994 = " + new LC994RottingOrangesSolver().orangesRotting(oranges));

        int[][] heights = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };
        System.out.println("LC417 = " + new LC417PacificAtlanticWaterFlowSolver().pacificAtlantic(heights));

        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        new LC130SurroundedRegionsSolver().solve(board);
        System.out.println("LC130 = " + Arrays.deepToString(board));

        int[][] binaryMatrix = {
                {0, 1},
                {1, 0}
        };
        System.out.println("LC1091 = " + new LC1091ShortestPathInBinaryMatrixSolver().shortestPathBinaryMatrix(binaryMatrix));
        System.out.println("LC207 = " + new LC207CourseScheduleSolver().canFinish(4, new int[][]{
                {1, 0}, {2, 1}, {3, 2}
        }));
        int inf = Integer.MAX_VALUE;
        int[][] rooms = {
                {inf, -1, 0, inf},
                {inf, inf, inf, -1},
                {inf, -1, inf, -1},
                {0, -1, inf, inf}
        };
        new LC286WallsAndGatesSolver().wallsAndGates(rooms);
        System.out.println("LC286 = " + Arrays.deepToString(rooms));
    }
}
