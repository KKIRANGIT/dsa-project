package com.practice.dsa.problems.arrays_hashing.valid_sudoku;

import java.util.HashSet;
import java.util.Set;

/**
 * LC 36 - Valid Sudoku
 *
 * Beginner idea:
 * A number cannot repeat:
 * - in the same row
 * - in the same column
 * - in the same 3x3 box
 *
 * We encode each rule as a string and store it in a set.
 * If the same rule appears twice, the board is invalid.
 */
public class LC36ValidSudokuSolver {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char value = board[row][col];
                if (value == '.') {
                    continue;
                }

                String rowKey = "row-" + row + "-" + value;
                String colKey = "col-" + col + "-" + value;
                String boxKey = "box-" + (row / 3) + "-" + (col / 3) + "-" + value;

                // If any key already exists, that rule was violated.
                if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                    return false;
                }
            }
        }

        return true;
    }
}
