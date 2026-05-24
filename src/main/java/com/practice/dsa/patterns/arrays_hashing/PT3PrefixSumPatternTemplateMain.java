package com.practice.dsa.patterns.arrays_hashing;

public class PT3PrefixSumPatternTemplateMain {
    public static void main(String[] args) {
        PT3PrefixSumPatternTemplate template = new PT3PrefixSumPatternTemplate();
        int[] prefix = template.buildPrefix(new int[]{2, 4, 1, 7, 3});
        System.out.println("sum[1..3] = " + template.query(prefix, 1, 3));
    }
}
