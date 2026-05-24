package com.practice.dsa.basics.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner min-heap reference.
 *
 * Smallest element always stays at index 0.
 *
 * Array shape idea:
 * - parent index = (child - 1) / 2
 * - left child   = 2 * index + 1
 * - right child  = 2 * index + 2
 */
public class MinHeap {
    // Dynamic array storing heap values.
    private final List<Integer> heap = new ArrayList<>();

    public void add(int value) {
        // Add value at the end first.
        heap.add(value);
        // Move it upward until heap order is restored.
        siftUp(heap.size() - 1);
    }

    public int poll() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        // Smallest value is at the root.
        int result = heap.get(0);
        // Remove last item from list.
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            // Move last item to root and push it down.
            heap.set(0, last);
            siftDown(0);
        }
        return result;
    }

    public int peek() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        // Root is always smallest.
        return heap.get(0);
    }

    private void siftUp(int index) {
        while (index > 0) {
            // Parent index in heap array.
            int parent = (index - 1) / 2;
            if (heap.get(parent) <= heap.get(index)) {
                // Heap property already holds.
                return;
            }
            // Child is smaller than parent, so move child upward.
            swap(parent, index);
            index = parent;
        }
    }

    private void siftDown(int index) {
        int size = heap.size();
        while (true) {
            // Compute children indexes.
            int left = index * 2 + 1;
            int right = index * 2 + 2;
            int smallest = index;

            if (left < size && heap.get(left) < heap.get(smallest)) {
                smallest = left;
            }
            if (right < size && heap.get(right) < heap.get(smallest)) {
                smallest = right;
            }
            if (smallest == index) {
                return;
            }
            // Swap current value with smaller child.
            swap(index, smallest);
            index = smallest;
        }
    }

    private void swap(int i, int j) {
        // Standard swap in array-backed structure.
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
