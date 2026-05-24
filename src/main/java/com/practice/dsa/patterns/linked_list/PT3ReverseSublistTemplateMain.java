package com.practice.dsa.patterns.linked_list;

import com.practice.dsa.common.LinkedListPrinter;
import com.practice.dsa.common.ListNode;

public class PT3ReverseSublistTemplateMain {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        PT3ReverseSublistTemplate template = new PT3ReverseSublistTemplate();
        System.out.println(LinkedListPrinter.stringify(template.reverseFirstK(head, 3)));
    }
}
