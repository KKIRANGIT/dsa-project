package com.practice.dsa.patterns.range_queries;

/**
 * Beginner Fenwick Tree / Binary Indexed Tree pattern.
 *
 * Use this for:
 * - point updates
 * - prefix sums
 * - range sums
 *
 * Time:
 * - update: O(log n)
 * - query:  O(log n)
 */
public class PT1FenwickTreeTemplate {
    private final int[] tree;

    public PT1FenwickTreeTemplate(int size) {
        // Fenwick tree uses 1-based indexing internally.
        this.tree = new int[size + 1];
    }

    public void add(int index, int delta) {
        // Convert external 0-based index to internal 1-based index.
        index++;

        // Move upward through responsible Fenwick buckets.
        while (index < tree.length) {
            tree[index] += delta;
            index += index & -index;
        }
    }

    public int prefixSum(int index) {
        // Convert external 0-based index to internal 1-based index.
        index++;
        int sum = 0;

        // Move upward toward root while collecting partial sums.
        while (index > 0) {
            sum += tree[index];
            index -= index & -index;
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
