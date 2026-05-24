package com.practice.dsa.problems.arrays_hashing.two_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LC1TwoSumSolverTest {
    @Test
    void returnsMatchingIndexes() {
        LC1TwoSumSolver solver = new LC1TwoSumSolver();

        assertArrayEquals(new int[]{0, 1}, solver.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}
