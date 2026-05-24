package com.practice.dsa.basics.linkedlist;

public class DoublyLinkedListBasicsMain {
    public static void main(String[] args) {
        // Create doubly linked list.
        DoublyLinkedListBasics list = new DoublyLinkedListBasics();
        // Add a few values.
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        // Print before removal.
        System.out.println("before = " + list.forward());
        // Remove the last node.
        list.removeLast();
        // Print after removal.
        System.out.println("after  = " + list.forward());
    }
}
