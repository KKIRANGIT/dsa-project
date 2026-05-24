package com.practice.dsa.problems.arrays_hashing.contains_duplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LC217ContainsDuplicateSolverTest {
    @Test
    void detectsDuplicate() {
        LC217ContainsDuplicateSolver solver = new LC217ContainsDuplicateSolver();

        assertTrue(solver.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertFalse(solver.containsDuplicate(new int[]{1, 2, 3, 4}));
    }
}
