package com.practice.dsa.basics.stack;

import com.practice.dsa.common.ListNode;

/**
 * Beginner stack reference using a linked list.
 *
 * The top of the stack is the linked-list head.
 *
 * This makes push and pop both O(1),
 * because only the head pointer changes.
 */
public class LinkedListStack {
    private ListNode head;

    public void push(int value) {
        // New node becomes the new stack top.
        head = new ListNode(value, head);
    }

    public int pop() {
        if (head == null) {
            throw new IllegalStateException("stack is empty");
        }

        // Read value at the current top.
        int value = head.val;
        // Remove the top by moving head one step forward.
        head = head.next;
        return value;
    }

    public int peek() {
        if (head == null) {
            throw new IllegalStateException("stack is empty");
        }
        return head.val;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
