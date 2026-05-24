package com.practice.dsa.problems.heap.kth_largest_element_in_a_stream;

public class LC703KthLargestInAStreamMain {
    public static void main(String[] args) {
        LC703KthLargestInAStream kthLargest = new LC703KthLargestInAStream(3, new int[]{4, 5, 8, 2});
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }
}
