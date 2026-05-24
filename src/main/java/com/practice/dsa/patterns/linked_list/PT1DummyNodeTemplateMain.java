package com.practice.dsa.patterns.linked_list;

import com.practice.dsa.common.LinkedListPrinter;
import com.practice.dsa.common.ListNode;

public class PT1DummyNodeTemplateMain {
    public static void main(String[] args) {
        // Build first sorted list.
        ListNode a = new ListNode(1, new ListNode(3, new ListNode(5)));
        // Build second sorted list.
        ListNode b = new ListNode(2, new ListNode(4, new ListNode(6)));

        // Create template helper.
        PT1DummyNodeTemplate template = new PT1DummyNodeTemplate();
        // Merge lists and print result.
        System.out.println(LinkedListPrinter.stringify(template.mergeSortedLists(a, b)));
    }
}
