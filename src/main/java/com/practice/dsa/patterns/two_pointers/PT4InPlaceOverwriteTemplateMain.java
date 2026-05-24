package com.practice.dsa.patterns.two_pointers;

import java.util.Arrays;

public class PT4InPlaceOverwriteTemplateMain {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        PT4InPlaceOverwriteTemplate template = new PT4InPlaceOverwriteTemplate();
        int size = template.removeDuplicatesFromSortedArray(nums);
        System.out.println("size = " + size);
        System.out.println("prefix = " + Arrays.toString(Arrays.copyOf(nums, size)));
    }
}
