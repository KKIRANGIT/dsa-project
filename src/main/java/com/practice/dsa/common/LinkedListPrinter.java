package com.practice.dsa.common;

public final class LinkedListPrinter {
    private LinkedListPrinter() {
    }

    public static String stringify(ListNode head) {
        StringBuilder builder = new StringBuilder();
        ListNode current = head;

        while (current != null) {
            builder.append(current.val);
            if (current.next != null) {
                builder.append(" -> ");
            }
            current = current.next;
        }

        return builder.toString();
    }
}
