package com.practice.dsa.basics.rangequeries;

/**
 * Beginner Lazy Segment Tree reference.
 *
 * This version supports:
 * - range add update
 * - range sum query
 *
 * Important beginner idea:
 * lazy[] stores postponed updates.
 * We do not push them to children until really necessary.
 */
public class LazySegmentTreeBasics {
    private final int[] tree;
    private final int[] lazy;
    private final int size;

    public LazySegmentTreeBasics(int[] nums) {
        this.size = nums.length;
        this.tree = new int[4 * nums.length];
        this.lazy = new int[4 * nums.length];
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

    public void rangeAdd(int updateLeft, int updateRight, int delta) {
        rangeAdd(1, 0, size - 1, updateLeft, updateRight, delta);
    }

    private void rangeAdd(int node, int left, int right, int updateLeft, int updateRight, int delta) {
        if (updateRight < left || right < updateLeft) {
            return;
        }

        if (updateLeft <= left && right <= updateRight) {
            tree[node] += (right - left + 1) * delta;
            lazy[node] += delta;
            return;
        }

        push(node, left, right);
        int mid = left + (right - left) / 2;
        rangeAdd(node * 2, left, mid, updateLeft, updateRight, delta);
        rangeAdd(node * 2 + 1, mid + 1, right, updateLeft, updateRight, delta);
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
        int leftChild = node * 2;
        int rightChild = node * 2 + 1;

        tree[leftChild] += (mid - left + 1) * lazy[node];
        tree[rightChild] += (right - mid) * lazy[node];
        lazy[leftChild] += lazy[node];
        lazy[rightChild] += lazy[node];
        lazy[node] = 0;
    }
}
