package com.practice.dsa.problems.heap;

import com.practice.dsa.problems.heap.find_median_from_data_stream.LC295FindMedianFromDataStream;
import com.practice.dsa.problems.heap.ipo.LC502IPOSolver;
import com.practice.dsa.problems.heap.kth_smallest_element_in_a_sorted_matrix.LC378KthSmallestElementInASortedMatrixSolver;
import com.practice.dsa.problems.heap.last_stone_weight.LC1046LastStoneWeightSolver;
import com.practice.dsa.problems.heap.kth_largest_element_in_a_stream.LC703KthLargestInAStream;
import com.practice.dsa.problems.heap.k_closest_points_to_origin.LC973KClosestPointsToOriginSolver;
import com.practice.dsa.problems.heap.kth_largest_element_in_an_array.LC215KthLargestElementInAnArraySolver;
import com.practice.dsa.problems.heap.reorganize_string.LC767ReorganizeStringSolver;
import com.practice.dsa.problems.heap.top_k_frequent_elements.LC347TopKFrequentElementsSolver;
import com.practice.dsa.problems.heap.task_scheduler.LC621TaskSchedulerSolver;

import java.util.Arrays;

public class HeapProblemsMain {
    public static void main(String[] args) {
        // Run kth-largest sample.
        System.out.println("LC215 = " + new LC215KthLargestElementInAnArraySolver().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        // Run k-closest-points sample.
        System.out.println("LC973 = " + Arrays.deepToString(new LC973KClosestPointsToOriginSolver().kClosest(
                new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2)));

        LC703KthLargestInAStream kthLargest = new LC703KthLargestInAStream(3, new int[]{4, 5, 8, 2});
        System.out.println("LC703 = " + kthLargest.add(3));

        LC295FindMedianFromDataStream stream = new LC295FindMedianFromDataStream();
        stream.addNum(1);
        stream.addNum(2);
        stream.addNum(3);
        System.out.println("LC295 = " + stream.findMedian());
        System.out.println("LC1046 = " + new LC1046LastStoneWeightSolver().lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
        System.out.println("LC621 = " + new LC621TaskSchedulerSolver().leastInterval(
                new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
        System.out.println("LC347 = " + Arrays.toString(new LC347TopKFrequentElementsSolver().topKFrequent(
                new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println("LC378 = " + new LC378KthSmallestElementInASortedMatrixSolver().kthSmallest(new int[][]{
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        }, 8));
        System.out.println("LC502 = " + new LC502IPOSolver().findMaximizedCapital(
                2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1}));
        System.out.println("LC767 = " + new LC767ReorganizeStringSolver().reorganizeString("aab"));
    }
}
