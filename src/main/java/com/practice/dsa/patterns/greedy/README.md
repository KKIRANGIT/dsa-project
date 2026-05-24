# Greedy Patterns

## What This Folder Covers

Use this folder when a locally best move can be proven to lead to the global answer.

## How To Identify This Topic

Pick this topic when you see signals like:

- jump reachability
- choose earliest finishing interval
- maintain farthest reachable point
- sorting by a key makes the best next choice obvious

## Study Order

1. `PT1ReachabilityGreedyTemplate`
2. `PT2IntervalGreedyTemplate`

## PT1 `PT1ReachabilityGreedyTemplate`

- Solves: reachability, jump range, minimum jumps with frontier logic.
- Identify: from each position you can extend how far the future can go.
- Typical LeetCode problems: `Jump Game`, `Jump Game II`, gas-station style greedy reasoning.
- Reminder: the proof is the important part in greedy. Do not use it unless the local choice is safe.

## PT2 `PT2IntervalGreedyTemplate`

- Solves: choose maximum non-overlapping intervals or remove minimum overlaps.
- Identify: sorting intervals by end time makes later choices easiest.
- Typical LeetCode problems: `Non-overlapping Intervals`, `Meeting Rooms`, `Minimum Number of Arrows to Burst Balloons`.
- Reminder: greedy interval problems usually become clear after sorting by start or end.