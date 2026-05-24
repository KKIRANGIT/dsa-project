package com.practice.dsa.patterns.arrays_hashing;

import java.util.Arrays;

public class PT2IndexLookupTemplateMain {
    public static void main(String[] args) {
        PT2IndexLookupTemplate template = new PT2IndexLookupTemplate();
        System.out.println(Arrays.toString(template.findPairSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
