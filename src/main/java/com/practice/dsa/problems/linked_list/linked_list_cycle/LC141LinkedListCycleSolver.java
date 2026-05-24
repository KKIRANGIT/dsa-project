package com.practice.dsa.problems.linked_list.linked_list_cycle;

import com.practice.dsa.common.ListNode;

/**
 * LC 141 - Linked List Cycle
 *
 * Beginner idea:
 * slow moves one step
 * fast moves two steps
 *
 * If there is a cycle, fast eventually catches slow.
 * If there is no cycle, fast reaches null.
 */
public class LC141LinkedListCycleSolver {
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
