package com.practice.dsa.problems.graphs.number_of_islands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LC200NumberOfIslandsSolverTest {
    @Test
    void countsIslands() {
        LC200NumberOfIslandsSolver solver = new LC200NumberOfIslandsSolver();
        char[][] grid = {
                {'1', '1', '0'},
                {'0', '1', '0'},
                {'1', '0', '1'}
        };

        assertEquals(3, solver.numIslands(grid));
    }
}
