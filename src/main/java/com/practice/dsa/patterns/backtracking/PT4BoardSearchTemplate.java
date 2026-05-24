package com.practice.dsa.patterns.backtracking;

/**
 * Beginner board-search backtracking pattern.
 *
 * Use for word search style problems on grids.
 */
public class PT4BoardSearchTemplate {
    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public boolean exists(char[][] board, String word) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (search(board, row, col, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, int row, int col, String word, int index) {
        if (index == word.length()) {
            return true;
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(index)) {
            return false;
        }

        char saved = board[row][col];
        board[row][col] = '#';

        for (int[] direction : DIRECTIONS) {
            if (search(board, row + direction[0], col + direction[1], word, index + 1)) {
                board[row][col] = saved;
                return true;
            }
        }

        board[row][col] = saved;
        return false;
    }
}
