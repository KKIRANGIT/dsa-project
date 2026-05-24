package com.practice.dsa.problems.graphs.surrounded_regions;

import java.util.Arrays;

public class LC130SurroundedRegionsMain {
    public static void main(String[] args) {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        new LC130SurroundedRegionsSolver().solve(board);

        System.out.println("LC130 = " + Arrays.deepToString(board));
    }
}
