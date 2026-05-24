package com.practice.dsa.patterns.bit_manipulation;

import java.util.ArrayList;
import java.util.List;

/**
 * Beginner submask-enumeration pattern.
 *
 * Use when all submasks of a mask must be visited efficiently.
 */
public class PT4SubmaskEnumerationTemplate {
    public List<Integer> submasks(int mask) {
        List<Integer> result = new ArrayList<>();
        int submask = mask;

        while (true) {
            result.add(submask);
            if (submask == 0) {
                break;
            }
            submask = (submask - 1) & mask;
        }

        return result;
    }
}
