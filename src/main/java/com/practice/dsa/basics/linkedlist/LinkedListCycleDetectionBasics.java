package com.practice.dsa.basics.linkedlist;

import com.practice.dsa.common.ListNode;

/**
 * Beginner cycle-detection reference using fast and slow pointers.
 */
public class LinkedListCycleDetectionBasics {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
