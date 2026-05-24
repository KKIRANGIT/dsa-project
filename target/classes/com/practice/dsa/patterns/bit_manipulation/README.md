# Bit Manipulation Patterns

## What This Folder Covers

Use this folder when binary representation makes the logic smaller, faster, or more expressive.

## How To Identify This Topic

Pick this topic when you see signals like:

- set, clear, or test a bit
- xor cancellation
- subset masks
- represent used items compactly

## Study Order

1. `PT1BitOperationsTemplate`
2. `PT2XorPatternTemplate`
3. `PT3BitMaskTemplate`
4. `PT4SubmaskEnumerationTemplate`

## PT1 `PT1BitOperationsTemplate`

- Solves: check, set, clear, toggle, count bits.
- Identify: the problem is easier if booleans are packed into an integer.
- Typical LeetCode problems: `Number of 1 Bits`, `Counting Bits`, bit flag tasks.
- Reminder: learn the core operators first because all later bit patterns depend on them.

## PT2 `PT2XorPatternTemplate`

- Solves: cancel paired values, find unique elements, parity flips.
- Identify: duplicates cancel out or an operation is naturally reversible.
- Typical LeetCode problems: `Single Number`, `Missing Number`, XOR-based partition tasks.
- Reminder: `a ^ a = 0` and `a ^ 0 = a` are the key identities.

## PT3 `PT3BitMaskTemplate`

- Solves: represent subsets and iterate choices compactly.
- Identify: the state is a small set of used or selected items.
- Typical LeetCode problems: `Subsets`, `Can I Win`, mask-based DP/helper tasks.
- Reminder: each bit position stands for one item or feature.

## PT4 `PT4SubmaskEnumerationTemplate`

- Solves: visit every submask of a mask efficiently.
- Identify: transition logic depends on all smaller subsets of a chosen set.
- Typical LeetCode problems: harder subset DP tasks, SOS-DP-style thinking, advanced mask transitions.
- Reminder: this is advanced but important once subset DP appears.