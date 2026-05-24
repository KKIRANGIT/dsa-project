package com.practice.dsa.patterns.range_queries;

/**
 * Beginner Segment Tree pattern.
 *
 * Use this for:
 * - range sum / min / max queries
 * - point updates
 * when prefix sums are not flexible enough.
 */
public class PT2SegmentTreeTemplate {
    private final int size;
    private final int[] tree;

    public PT2SegmentTreeTemplate(int[] nums) {
        this.size = nums.length;
        this.tree = new int[4 * size];
        build(nums, 1, 0, size - 1);
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

    public void update(int index, int value) {
        update(1, 0, size - 1, index, value);
    }

    private void update(int node, int left, int right, int index, int value) {
        if (left == right) {
            tree[node] = value;
            return;
        }

        int mid = left + (right - left) / 2;
        if (index <= mid) {
            update(node * 2, left, mid, index, value);
        } else {
            update(node * 2 + 1, mid + 1, right, index, value);
        }

        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    public int query(int queryLeft, int queryRight) {
        return query(1, 0, size - 1, queryLeft, queryRight);
    }

    private int query(int node, int left, int right, int queryLeft, int queryRight) {
        if (queryRight < left || right < queryLeft) {
            return 0;
        }

        if (queryLeft <= left && right <= queryRight) {
            return tree[node];
        }

        int mid = left + (right - left) / 2;
        return query(node * 2, left, mid, queryLeft, queryRight)
                + query(node * 2 + 1, mid + 1, right, queryLeft, queryRight);
    }
}
