# Tree Patterns

## What This Folder Covers

Use this folder when the recursive structure of a tree drives the solution.

## How To Identify This Topic

Pick this topic when you see signals like:

- answer depends on left and right child answers
- traversal order matters
- level-by-level processing
- ancestor or BST validity queries

## Study Order

1. `PT1DepthFirstTraversalTemplate`
2. `PT2LevelOrderTemplate`
3. `PT3BottomUpTreeDpTemplate`
4. `PT4BstValidationTemplate`
5. `PT5BinaryLiftingLcaTemplate`

## PT1 `PT1DepthFirstTraversalTemplate`

- Solves: preorder, inorder, postorder, path building, subtree traversal.
- Identify: you must visit nodes recursively and process children in a chosen order.
- Typical LeetCode problems: `Binary Tree Inorder Traversal`, `Path Sum`, `Same Tree`, `Invert Binary Tree`.
- Reminder: choose the traversal order based on when you need the node value.

## PT2 `PT2LevelOrderTemplate`

- Solves: BFS by level, shortest edge distance on trees, per-level aggregation.
- Identify: the problem mentions each level, left-to-right order, or breadth-first processing.
- Typical LeetCode problems: `Binary Tree Level Order Traversal`, `Right Side View`, `Minimum Depth of Binary Tree`.
- Reminder: queue size at the start of a round tells you how many nodes belong to the current level.

## PT3 `PT3BottomUpTreeDpTemplate`

- Solves: subtree height, balanced checks, diameter, robbery on trees, DP per node.
- Identify: each node answer depends on child answers before parent answer can be computed.
- Typical LeetCode problems: `Balanced Binary Tree`, `Diameter of Binary Tree`, `House Robber III`.
- Reminder: return structured information upward from recursion.

## PT4 `PT4BstValidationTemplate`

- Solves: BST validation, BST search logic, range constraints over a whole subtree.
- Identify: the tree is supposed to obey ordered value rules, not just local child comparisons.
- Typical LeetCode problems: `Validate Binary Search Tree`, `Lowest Common Ancestor of a BST`, `Kth Smallest Element in a BST` reasoning.
- Reminder: a valid BST needs global min/max constraints, not only immediate child checks.

## PT5 `PT5BinaryLiftingLcaTemplate`

- Solves: repeated ancestor jumps and many LCA queries on the same tree.
- Identify: there are many ancestor queries, not just one.
- Typical LeetCode problems: `Lowest Common Ancestor of a Binary Tree` at scale, ancestor query systems, tree query tasks from harder interviews.
- Reminder: preprocess once, answer many queries fast.