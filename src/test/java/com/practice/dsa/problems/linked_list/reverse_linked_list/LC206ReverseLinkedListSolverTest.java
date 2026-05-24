package com.practice.dsa.problems.linked_list.reverse_linked_list;

import com.practice.dsa.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LC206ReverseLinkedListSolverTest {
    @Test
    void reversesLinkedList() {
        LC206ReverseLinkedListSolver solver = new LC206ReverseLinkedListSolver();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));

        ListNode reversed = solver.reverseList(head);

        assertEquals(3, reversed.val);
        assertEquals(2, reversed.next.val);
        assertEquals(1, reversed.next.next.val);
        assertNull(reversed.next.next.next);
    }
}
