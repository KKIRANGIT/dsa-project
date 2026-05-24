package com.practice.dsa.problems.trees;

import com.practice.dsa.common.TreeNode;
import com.practice.dsa.common.TreePrinter;
import com.practice.dsa.problems.trees.balanced_binary_tree.LC110BalancedBinaryTreeSolver;
import com.practice.dsa.problems.trees.binary_tree_right_side_view.LC199BinaryTreeRightSideViewSolver;
import com.practice.dsa.problems.trees.binary_tree_level_order_traversal.LC102BinaryTreeLevelOrderTraversalSolver;
import com.practice.dsa.problems.trees.construct_binary_tree_from_preorder_and_inorder_traversal.LC105ConstructBinaryTreeFromPreorderAndInorderTraversalSolver;
import com.practice.dsa.problems.trees.diameter_of_binary_tree.LC543DiameterOfBinaryTreeSolver;
import com.practice.dsa.problems.trees.invert_binary_tree.LC226InvertBinaryTreeSolver;
import com.practice.dsa.problems.trees.kth_smallest_element_in_a_bst.LC230KthSmallestElementInABstSolver;
import com.practice.dsa.problems.trees.lowest_common_ancestor_of_a_binary_search_tree.LC235LowestCommonAncestorOfABinarySearchTreeSolver;
import com.practice.dsa.problems.trees.maximum_depth_of_binary_tree.LC104MaximumDepthOfBinaryTreeSolver;
import com.practice.dsa.problems.trees.same_tree.LC100SameTreeSolver;
import com.practice.dsa.problems.trees.validate_binary_search_tree.LC98ValidateBinarySearchTreeSolver;

/**
 * Beginner topic runner for Tree problems.
 */
public class TreesProblemsMain {
    public static void main(String[] args) {
        // Build a sample tree for depth and level order.
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        // Run max-depth sample.
        System.out.println("LC104 = " + new LC104MaximumDepthOfBinaryTreeSolver().maxDepth(root));
        // Run level-order sample.
        System.out.println("LC102 = " + new LC102BinaryTreeLevelOrderTraversalSolver().levelOrder(root));

        // Build a separate tree for inversion.
        TreeNode invertRoot = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        // Run invert-tree sample.
        System.out.println("LC226 = " + TreePrinter.levelOrder(new LC226InvertBinaryTreeSolver().invertTree(invertRoot)));

        // Build a valid BST.
        TreeNode bst = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        // Run validate-BST sample.
        System.out.println("LC98  = " + new LC98ValidateBinarySearchTreeSolver().isValidBST(bst));

        // Same-tree sample.
        System.out.println("LC100 = " + new LC100SameTreeSolver().isSameTree(
                new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                new TreeNode(1, new TreeNode(2), new TreeNode(3))
        ));
        // Diameter sample.
        System.out.println("LC543 = " + new LC543DiameterOfBinaryTreeSolver().diameterOfBinaryTree(
                new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3))
        ));
        // Balanced-tree sample.
        System.out.println("LC110 = " + new LC110BalancedBinaryTreeSolver().isBalanced(root));
        // Right-side-view sample.
        System.out.println("LC199 = " + new LC199BinaryTreeRightSideViewSolver().rightSideView(root));
        // Lowest-common-ancestor sample on a BST.
        TreeNode lcaRoot = new TreeNode(6,
                new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8, new TreeNode(7), new TreeNode(9)));
        System.out.println("LC235 = " + new LC235LowestCommonAncestorOfABinarySearchTreeSolver()
                .lowestCommonAncestor(lcaRoot, lcaRoot.left, lcaRoot.left.right).val);
        // Kth-smallest sample.
        System.out.println("LC230 = " + new LC230KthSmallestElementInABstSolver().kthSmallest(lcaRoot, 3));
        // Build-tree sample.
        System.out.println("LC105 = " + TreePrinter.levelOrder(
                new LC105ConstructBinaryTreeFromPreorderAndInorderTraversalSolver().buildTree(
                        new int[]{3, 9, 20, 15, 7},
                        new int[]{9, 3, 15, 20, 7}
                )));
    }
}
