package com.practice.dsa.patterns.two_pointers;

public class PT2SameDirectionWindowTemplateMain {
    public static void main(String[] args) {
        PT2SameDirectionWindowTemplate template = new PT2SameDirectionWindowTemplate();
        System.out.println(template.longestNonDecreasingRun(new int[]{1, 2, 2, 1, 3, 4}));
    }
}
