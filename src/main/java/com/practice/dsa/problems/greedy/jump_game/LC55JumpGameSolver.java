package com.practice.dsa.problems.greedy.jump_game;

/**
 * LC 55 - Jump Game
 *
 * Beginner idea:
 * Work backward from the goal.
 * If a position can reach the current goal, that position becomes the new goal.
 */
public class LC55JumpGameSolver {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;
    }
}
