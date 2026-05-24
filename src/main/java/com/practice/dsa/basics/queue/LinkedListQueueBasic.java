package com.practice.dsa.basics.queue;

import com.practice.dsa.common.ListNode;

/**
 * Beginner queue reference using a linked list.
 *
 * head = front of queue
 * tail = rear of queue
 */
public class LinkedListQueueBasic {
    private ListNode head;
    private ListNode tail;

    public void offer(int value) {
        ListNode node = new ListNode(value);
        if (tail == null) {
            // Empty queue case: head and tail both point to the first node.
            head = node;
            tail = node;
            return;
        }
        // Attach new node at the rear and move tail forward.
        tail.next = node;
        tail = node;
    }

    public int poll() {
        if (head == null) {
            throw new IllegalStateException("queue is empty");
        }

        // Front node leaves first because queue is FIFO.
        int value = head.val;
        head = head.next;
        if (head == null) {
            // Queue became empty after removal.
            tail = null;
        }
        return value;
    }

    public int peek() {
        if (head == null) {
            throw new IllegalStateException("queue is empty");
        }
        return head.val;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
