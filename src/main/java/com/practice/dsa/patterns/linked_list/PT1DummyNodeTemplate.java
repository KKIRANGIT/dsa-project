package com.practice.dsa.patterns.linked_list;

import com.practice.dsa.common.ListNode;

/**
 * Beginner dummy-node linked-list pattern.
 *
 * Dummy node helps avoid special head-handling cases.
 */
public class PT1DummyNodeTemplate {
    public ListNode mergeSortedLists(ListNode a, ListNode b) {
        // Dummy node stays before the real merged list.
        ListNode dummy = new ListNode(-1);
        // tail always points to the last node in the merged list.
        ListNode tail = dummy;

        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        // Attach remaining nodes from whichever list is not empty.
        tail.next = a != null ? a : b;
        // Real head starts after dummy.
        return dummy.next;
    }
}
