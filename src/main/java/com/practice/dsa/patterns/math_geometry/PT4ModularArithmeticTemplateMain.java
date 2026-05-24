package com.practice.dsa.patterns.math_geometry;

public class PT4ModularArithmeticTemplateMain {
    public static void main(String[] args) {
        PT4ModularArithmeticTemplate template = new PT4ModularArithmeticTemplate();
        System.out.println(template.modPow(2, 10, 1_000_000_007L));
    }
}
