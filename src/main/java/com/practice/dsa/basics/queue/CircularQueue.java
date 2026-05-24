package com.practice.dsa.basics.queue;

/**
 * Beginner circular queue reference.
 *
 * Queue rule:
 * First In, First Out (FIFO)
 *
 * Circular means indexes wrap around to the front when needed.
 */
public class CircularQueue {
    // Internal storage array.
    private final int[] data;
    // front points to the current first element.
    private int front;
    // size tells how many items are inside the queue.
    private int size;

    public CircularQueue(int capacity) {
        // Create queue with fixed capacity.
        this.data = new int[capacity];
    }

    public void offer(int value) {
        if (size == data.length) {
            throw new IllegalStateException("Queue is full");
        }

        // rear is computed from front and current size.
        int rear = (front + size) % data.length;
        data[rear] = value;
        size++;
    }

    public int poll() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        // Read current front value.
        int value = data[front];
        // Move front one step forward, wrapping if necessary.
        front = (front + 1) % data.length;
        size--;
        return value;
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        // Front value is the next item to remove.
        return data[front];
    }
}
