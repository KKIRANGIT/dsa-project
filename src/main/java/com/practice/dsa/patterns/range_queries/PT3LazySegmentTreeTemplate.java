package com.practice.dsa.patterns.range_queries;

/**
 * Beginner lazy segment tree pattern.
 *
 * Use this when range updates and range queries both happen online.
 */
public class PT3LazySegmentTreeTemplate {
    private final int n;
    private final int[] tree;
    private final int[] lazy;

    public PT3LazySegmentTreeTemplate(int[] nums) {
        this.n = nums.length;
        this.tree = new int[4 * n];
        this.lazy = new int[4 * n];
        build(nums, 1, 0, n - 1);
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

    public void rangeAdd(int queryLeft, int queryRight, int delta) {
        rangeAdd(1, 0, n - 1, queryLeft, queryRight, delta);
    }

    private void rangeAdd(int node, int left, int right, int queryLeft, int queryRight, int delta) {
        if (queryRight < left || right < queryLeft) {
            return;
        }
        if (queryLeft <= left && right <= queryRight) {
            tree[node] += (right - left + 1) * delta;
            lazy[node] += delta;
            return;
        }

        push(node, left, right);
        int mid = left + (right - left) / 2;
        rangeAdd(node * 2, left, mid, queryLeft, queryRight, delta);
        rangeAdd(node * 2 + 1, mid + 1, right, queryLeft, queryRight, delta);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    public int rangeSum(int queryLeft, int queryRight) {
        return rangeSum(1, 0, n - 1, queryLeft, queryRight);
    }

    private int rangeSum(int node, int left, int right, int queryLeft, int queryRight) {
        if (queryRight < left || right < queryLeft) {
            return 0;
        }
        if (queryLeft <= left && right <= queryRight) {
            return tree[node];
        }

        push(node, left, right);
        int mid = left + (right - left) / 2;
        return rangeSum(node * 2, left, mid, queryLeft, queryRight)
                + rangeSum(node * 2 + 1, mid + 1, right, queryLeft, queryRight);
    }

    private void push(int node, int left, int right) {
        if (lazy[node] == 0 || left == right) {
            return;
        }
        int mid = left + (right - left) / 2;
        int value = lazy[node];

        tree[node * 2] += (mid - left + 1) * value;
        tree[node * 2 + 1] += (right - mid) * value;
        lazy[node * 2] += value;
        lazy[node * 2 + 1] += value;
        lazy[node] = 0;
    }
}
