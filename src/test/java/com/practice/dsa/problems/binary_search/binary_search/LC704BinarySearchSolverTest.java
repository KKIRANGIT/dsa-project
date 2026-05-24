package com.practice.dsa.problems.binary_search.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LC704BinarySearchSolverTest {
    @Test
    void findsTargetIndex() {
        LC704BinarySearchSolver solver = new LC704BinarySearchSolver();

        assertEquals(4, solver.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        assertEquals(-1, solver.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}
