package com.practice.dsa.basics.rangequeries;

/**
 * Beginner Fenwick Tree reference.
 *
 * Fenwick Tree is also called Binary Indexed Tree.
 *
 * It supports:
 * - point updates
 * - prefix sum queries
 *
 * Important beginner idea:
 * indexes are usually handled as 1-based internally.
 */
public class FenwickTreeBasics {
    private final int[] tree;

    public FenwickTreeBasics(int size) {
        this.tree = new int[size + 1];
    }

    public void add(int index, int delta) {
        int position = index + 1;
        while (position < tree.length) {
            tree[position] += delta;
            position += position & -position;
        }
    }

    public int prefixSum(int index) {
        int position = index + 1;
        int sum = 0;
        while (position > 0) {
            sum += tree[position];
            position -= position & -position;
        }
        return sum;
    }

    public int rangeSum(int left, int right) {
        if (left == 0) {
            return prefixSum(right);
        }
        return prefixSum(right) - prefixSum(left - 1);
    }
}
