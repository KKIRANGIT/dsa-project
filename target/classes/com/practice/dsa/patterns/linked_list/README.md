# Linked List Patterns

## What This Folder Covers

Use this folder when pointer rewiring is the main difficulty.

## How To Identify This Topic

Pick this topic when you see signals like:

- deleting or inserting near the head
- reversing a full list or sublist
- stable pointer movement without array indexing
- head edge cases causing bugs

## Study Order

1. `PT1DummyNodeTemplate`
2. `PT2RemoveWithDummyTemplate`
3. `PT3ReverseSublistTemplate`

## PT1 `PT1DummyNodeTemplate`

- Solves: insertion, merge, and deletion problems with head-edge-case simplification.
- Identify: special handling for the head node makes the code messy.
- Typical LeetCode problems: `Merge Two Sorted Lists`, `Partition List`, `Swap Nodes in Pairs`.
- Reminder: a dummy node gives you a stable node before the head.

## PT2 `PT2RemoveWithDummyTemplate`

- Solves: node deletion where the head may also be removed.
- Identify: removal logic should work uniformly for head and non-head nodes.
- Typical LeetCode problems: `Remove Linked List Elements`, `Remove Nth Node From End of List`, `Delete Node in a Linked List` variant reasoning.
- Reminder: track the node before the current node when unlinking.

## PT3 `PT3ReverseSublistTemplate`

- Solves: reverse all or part of a list while preserving the rest.
- Identify: the problem asks to reverse nodes between two positions or in groups.
- Typical LeetCode problems: `Reverse Linked List`, `Reverse Linked List II`, `Reverse Nodes in k-Group`.
- Reminder: keep references to the node before the reversed part and the tail after it.