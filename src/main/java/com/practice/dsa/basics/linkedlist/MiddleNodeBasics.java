package com.practice.dsa.basics.linkedlist;

import com.practice.dsa.common.ListNode;

/**
 * Beginner fast-slow pointer reference for linked lists.
 *
 * Fast pointer moves 2 steps.
 * Slow pointer moves 1 step.
 * When fast reaches the end, slow is at the middle.
 */
public class MiddleNodeBasics {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            // Slow advances one node at a time.
            slow = slow.next;
            // Fast advances two nodes at a time.
            fast = fast.next.next;
        }

        // Slow now points to the middle node.
        return slow;
    }
}
