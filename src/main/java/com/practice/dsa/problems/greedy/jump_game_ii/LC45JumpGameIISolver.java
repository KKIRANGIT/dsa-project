package com.practice.dsa.problems.greedy.jump_game_ii;

/**
 * LC 45 - Jump Game II
 *
 * Beginner idea:
 * currentEnd marks the farthest place reachable with the current number of jumps.
 * farthest tracks how far the next jump could take us.
 *
 * When we reach currentEnd, we must commit to one more jump.
 */
public class LC45JumpGameIISolver {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}
