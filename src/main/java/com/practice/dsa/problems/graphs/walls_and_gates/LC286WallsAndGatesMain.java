package com.practice.dsa.problems.graphs.walls_and_gates;

import java.util.Arrays;

public class LC286WallsAndGatesMain {
    public static void main(String[] args) {
        int inf = Integer.MAX_VALUE;
        int[][] rooms = {
                {inf, -1, 0, inf},
                {inf, inf, inf, -1},
                {inf, -1, inf, -1},
                {0, -1, inf, inf}
        };

        new LC286WallsAndGatesSolver().wallsAndGates(rooms);
        System.out.println("LC286 = " + Arrays.deepToString(rooms));
    }
}
