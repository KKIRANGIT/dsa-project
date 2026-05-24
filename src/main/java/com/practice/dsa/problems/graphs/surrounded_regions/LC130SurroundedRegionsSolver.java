package com.practice.dsa.problems.graphs.surrounded_regions;

/**
 * LC 130 - Surrounded Regions
 *
 * Beginner idea:
 * Any 'O' connected to the border cannot be captured.
 * So first mark all safe border-connected cells, then flip the remaining 'O' cells.
 */
public class LC130SurroundedRegionsSolver {
    private static final int[][] DIRECTIONS = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        for (int row = 0; row < rows; row++) {
            dfs(board, row, 0);
            dfs(board, row, cols - 1);
        }
        for (int col = 0; col < cols; col++) {
            dfs(board, 0, col);
            dfs(board, rows - 1, col);
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == 'O') {
                    board[row][col] = 'X';
                } else if (board[row][col] == '#') {
                    board[row][col] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int row, int col) {
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) {
            return;
        }
        if (board[row][col] != 'O') {
            return;
        }

        board[row][col] = '#';

        for (int[] direction : DIRECTIONS) {
            dfs(board, row + direction[0], col + direction[1]);
        }
    }
}
