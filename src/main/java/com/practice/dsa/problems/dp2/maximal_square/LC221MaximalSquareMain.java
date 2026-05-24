package com.practice.dsa.problems.dp2.maximal_square;

public class LC221MaximalSquareMain {
    public static void main(String[] args) {
        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        System.out.println("LC221 = " + new LC221MaximalSquareSolver().maximalSquare(matrix));
    }
}
