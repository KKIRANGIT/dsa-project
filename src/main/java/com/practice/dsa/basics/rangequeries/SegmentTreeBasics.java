package com.practice.dsa.basics.rangequeries;

/**
 * Beginner Segment Tree reference.
 *
 * This version stores range sums.
 *
 * It supports:
 * - point update
 * - range sum query
 *
 * Segment tree is more general than Fenwick tree,
 * but the implementation is also heavier.
 */
public class SegmentTreeBasics {
    private final int[] tree;
    private final int size;

    public SegmentTreeBasics(int[] nums) {
        this.size = nums.length;
        this.tree = new int[4 * nums.length];
        build(nums, 1, 0, nums.length - 1);
    }

    private void build(int[] nums, int node, int left, int right) {
        if (left == right) {
            tree[node] = nums[left];
            return;
        }

        int mid = left + (right - left) / 2;
        build(nums, node * 2, left, mid);
        build(nums, node * 2 + 1, mid + 1, right);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    public void update(int index, int newValue) {
        update(1, 0, size - 1, index, newValue);
    }

    private void update(int node, int left, int right, int index, int newValue) {
        if (left == right) {
            tree[node] = newValue;
            return;
        }

        int mid = left + (right - left) / 2;
        if (index <= mid) {
            update(node * 2, left, mid, index, newValue);
        } else {
            update(node * 2 + 1, mid + 1, right, index, newValue);
        }

        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    public int rangeSum(int queryLeft, int queryRight) {
        return rangeSum(1, 0, size - 1, queryLeft, queryRight);
    }

    private int rangeSum(int node, int left, int right, int queryLeft, int queryRight) {
        if (queryRight < left || right < queryLeft) {
            return 0;
        }
        if (queryLeft <= left && right <= queryRight) {
            return tree[node];
        }

        int mid = left + (right - left) / 2;
        return rangeSum(node * 2, left, mid, queryLeft, queryRight)
                + rangeSum(node * 2 + 1, mid + 1, right, queryLeft, queryRight);
    }
}
