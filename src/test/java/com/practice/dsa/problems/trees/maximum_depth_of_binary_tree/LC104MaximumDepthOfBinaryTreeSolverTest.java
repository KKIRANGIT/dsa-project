package com.practice.dsa.problems.trees.maximum_depth_of_binary_tree;

import com.practice.dsa.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LC104MaximumDepthOfBinaryTreeSolverTest {
    @Test
    void computesTreeDepth() {
        LC104MaximumDepthOfBinaryTreeSolver solver = new LC104MaximumDepthOfBinaryTreeSolver();
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        assertEquals(3, solver.maxDepth(root));
    }
}
