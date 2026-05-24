package com.practice.dsa.patterns.heap;

public class PT1TopKTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT1TopKTemplate template = new PT1TopKTemplate();
        // Print the 3 smallest values.
        System.out.println(template.topKSmallest(new int[]{7, 2, 9, 1, 4}, 3));
    }
}
