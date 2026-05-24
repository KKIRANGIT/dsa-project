package com.practice.dsa.patterns.linked_list;

import com.practice.dsa.common.LinkedListPrinter;
import com.practice.dsa.common.ListNode;

public class PT2RemoveWithDummyTemplateMain {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(6)))));
        PT2RemoveWithDummyTemplate template = new PT2RemoveWithDummyTemplate();
        System.out.println(LinkedListPrinter.stringify(template.removeValue(head, 6)));
    }
}
