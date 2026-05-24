package com.practice.dsa.patterns.bit_manipulation;

public class PT3BitMaskTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT3BitMaskTemplate template = new PT3BitMaskTemplate();
        // Print all subsets using bitmask technique.
        System.out.println(template.subsets(new int[]{1, 2, 3}));
    }
}
