package com.practice.dsa.basics.rangequeries;

public class FenwickTreeBasicsMain {
    public static void main(String[] args) {
        FenwickTreeBasics tree = new FenwickTreeBasics(5);

        tree.add(0, 2);
        tree.add(1, 4);
        tree.add(2, 1);
        tree.add(3, 7);
        tree.add(4, 3);

        System.out.println("prefixSum(3) = " + tree.prefixSum(3));
        System.out.println("rangeSum(1, 3) = " + tree.rangeSum(1, 3));
    }
}
