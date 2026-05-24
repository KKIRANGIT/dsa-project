package com.practice.dsa.patterns.greedy;

/**
 * Beginner reachability greedy pattern.
 */
public class PT1ReachabilityGreedyTemplate {
    public boolean canReachEnd(int[] nums) {
        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                return false;
            }
            farthest = Math.max(farthest, i + nums[i]);
        }

        return true;
    }
}
