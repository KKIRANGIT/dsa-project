package com.practice.dsa.patterns.two_pointers;

import com.practice.dsa.common.ListNode;

/**
 * Beginner fast/slow pointer pattern.
 *
 * slow moves one step
 * fast moves two steps
 *
 * Useful for middle node and cycle problems.
 */
public class PT3FastSlowPointerTemplate {
    public ListNode middleNode(ListNode head) {
        // Both start at head.
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            // Slow moves one step.
            slow = slow.next;
            // Fast moves two steps.
            fast = fast.next.next;
        }

        // When fast ends, slow is at the middle.
        return slow;
    }
}
