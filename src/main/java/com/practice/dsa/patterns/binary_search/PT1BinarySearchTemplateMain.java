package com.practice.dsa.patterns.binary_search;

public class PT1BinarySearchTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT1BinarySearchTemplate template = new PT1BinarySearchTemplate();
        // Print smallest valid speed.
        System.out.println("min speed = " + template.searchOnAnswer(new int[]{3, 6, 7, 11}, 8));
    }
}
