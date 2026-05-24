package com.practice.dsa.basics.graph;

public class PrimMstBasicsMain {
    public static void main(String[] args) {
        int[][] edges = {
                {0, 1, 1},
                {0, 2, 4},
                {1, 2, 2},
                {1, 3, 5},
                {2, 3, 1}
        };

        PrimMstBasics basics = new PrimMstBasics();
        System.out.println("mst cost = " + basics.mstCost(4, edges));
    }
}
