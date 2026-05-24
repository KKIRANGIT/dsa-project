package com.practice.dsa.patterns.bit_manipulation;

public class PT1BitOperationsTemplateMain {
    public static void main(String[] args) {
        PT1BitOperationsTemplate template = new PT1BitOperationsTemplate();
        int mask = 0;
        mask = template.setBit(mask, 2);
        System.out.println(template.isSet(mask, 2));
        System.out.println(template.clearBit(mask, 2));
    }
}
