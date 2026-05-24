package com.practice.dsa.problems.heap.find_median_from_data_stream;

public class LC295FindMedianFromDataStreamMain {
    public static void main(String[] args) {
        LC295FindMedianFromDataStream stream = new LC295FindMedianFromDataStream();
        stream.addNum(1);
        stream.addNum(2);
        System.out.println(stream.findMedian());
        stream.addNum(3);
        System.out.println(stream.findMedian());
    }
}
