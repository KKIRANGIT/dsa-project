package com.practice.dsa.problems.arrays_hashing.valid_sudoku;

public class LC36ValidSudokuMain {
    public static void main(String[] args) {
        // Sudoku board represented as characters.
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // Create solver object.
        LC36ValidSudokuSolver solver = new LC36ValidSudokuSolver();
        // Print whether the board is valid.
        System.out.println("valid = " + solver.isValidSudoku(board));
    }
}
