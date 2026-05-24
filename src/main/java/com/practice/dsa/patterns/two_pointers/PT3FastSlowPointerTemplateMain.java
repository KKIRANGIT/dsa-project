package com.practice.dsa.patterns.two_pointers;

import com.practice.dsa.common.ListNode;

public class PT3FastSlowPointerTemplateMain {
    public static void main(String[] args) {
        // Build sample linked list.
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4, new ListNode(5)))));

        // Create template helper.
        PT3FastSlowPointerTemplate template = new PT3FastSlowPointerTemplate();
        // Print middle node value.
        System.out.println("middle = " + template.middleNode(head).val);
    }
}
