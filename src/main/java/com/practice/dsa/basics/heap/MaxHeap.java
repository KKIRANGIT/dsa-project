package com.practice.dsa.basics.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner max-heap reference.
 *
 * Largest element always stays at index 0.
 *
 * Same array shape rules as min-heap, but comparison direction is reversed.
 */
public class MaxHeap {
    private final List<Integer> heap = new ArrayList<>();

    public void add(int value) {
        // Add value at end, then restore heap order upward.
        heap.add(value);
        siftUp(heap.size() - 1);
    }

    public int poll() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        // Root contains the largest value.
        int result = heap.get(0);
        // Remove last value.
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            // Move last value to root and push it downward.
            heap.set(0, last);
            siftDown(0);
        }
        return result;
    }

    public int peek() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        // Root is always largest.
        return heap.get(0);
    }

    private void siftUp(int index) {
        while (index > 0) {
            // Compute parent index.
            int parent = (index - 1) / 2;
            if (heap.get(parent) >= heap.get(index)) {
                // Heap property already holds.
                return;
            }
            // Swap upward when child is larger than parent.
            swap(parent, index);
            index = parent;
        }
    }

    private void siftDown(int index) {
        while (true) {
            // Compute children indexes.
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int largest = index;

            if (left < heap.size() && heap.get(left) > heap.get(largest)) {
                largest = left;
            }
            if (right < heap.size() && heap.get(right) > heap.get(largest)) {
                largest = right;
            }
            if (largest == index) {
                return;
            }
            // Swap downward with larger child.
            swap(index, largest);
            index = largest;
        }
    }

    private void swap(int i, int j) {
        // Standard swap helper.
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
