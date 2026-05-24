package com.practice.dsa.problems.linked_list.reverse_linked_list;

import com.practice.dsa.common.LinkedListPrinter;
import com.practice.dsa.common.ListNode;

public class LC206ReverseLinkedListMain {
    public static void main(String[] args) {
        // Build the linked list 1 -> 2 -> 3 -> 4.
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        // Create solver object.
        LC206ReverseLinkedListSolver solver = new LC206ReverseLinkedListSolver();
        // Reverse the list and print the result.
        System.out.println(LinkedListPrinter.stringify(solver.reverseList(head)));
    }
}
