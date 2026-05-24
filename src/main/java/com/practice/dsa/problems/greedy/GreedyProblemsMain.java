package com.practice.dsa.problems.greedy;

import com.practice.dsa.problems.greedy.best_time_to_buy_and_sell_stock_ii.LC122BestTimeToBuyAndSellStockIISolver;
import com.practice.dsa.problems.greedy.gas_station.LC134GasStationSolver;
import com.practice.dsa.problems.greedy.jump_game.LC55JumpGameSolver;
import com.practice.dsa.problems.greedy.jump_game_ii.LC45JumpGameIISolver;
import com.practice.dsa.problems.greedy.lemonade_change.LC860LemonadeChangeSolver;
import com.practice.dsa.problems.greedy.merge_triplets_to_form_target_triplet.LC1899MergeTripletsToFormTargetTripletSolver;
import com.practice.dsa.problems.greedy.partition_labels.LC763PartitionLabelsSolver;
import com.practice.dsa.problems.greedy.queue_reconstruction_by_height.LC406QueueReconstructionByHeightSolver;
import com.practice.dsa.problems.greedy.valid_parenthesis_string.LC678ValidParenthesisStringSolver;

import java.util.Arrays;

public class GreedyProblemsMain {
    public static void main(String[] args) {
        // Run jump-game sample.
        System.out.println("LC55  = " + new LC55JumpGameSolver().canJump(new int[]{2, 3, 1, 1, 4}));
        // Run jump-game-ii sample.
        System.out.println("LC45  = " + new LC45JumpGameIISolver().jump(new int[]{2, 3, 1, 1, 4}));
        // Run gas-station sample.
        System.out.println("LC134 = " + new LC134GasStationSolver().canCompleteCircuit(
                new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
        System.out.println("LC122 = " + new LC122BestTimeToBuyAndSellStockIISolver().maxProfit(
                new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println("LC763 = " + new LC763PartitionLabelsSolver().partitionLabels("ababcbacadefegdehijhklij"));
        System.out.println("LC406 = " + Arrays.deepToString(new LC406QueueReconstructionByHeightSolver().reconstructQueue(
                new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}}
        )));
        System.out.println("LC678 = " + new LC678ValidParenthesisStringSolver().checkValidString("(*))"));
        System.out.println("LC1899 = " + new LC1899MergeTripletsToFormTargetTripletSolver().mergeTriplets(
                new int[][]{{2, 5, 3}, {1, 8, 4}, {1, 7, 5}}, new int[]{2, 7, 5}
        ));
        System.out.println("LC860 = " + new LC860LemonadeChangeSolver().lemonadeChange(
                new int[]{5, 5, 5, 10, 20}));
    }
}
