package com.practice.dsa.patterns.dp;

public class PT5KnapsackTemplateMain {
    public static void main(String[] args) {
        PT5KnapsackTemplate template = new PT5KnapsackTemplate();
        System.out.println(template.maximumValue(
                new int[]{1, 3, 4, 5},
                new int[]{1, 4, 5, 7},
                7
        ));
    }
}
