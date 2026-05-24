# Interval Patterns

## What This Folder Covers

Use this folder when each input item is a range with a start and end.

## How To Identify This Topic

Pick this topic when you see signals like:

- merge or insert intervals
- count overlaps
- choose compatible ranges
- convert starts and ends into events

## Study Order

1. `PT1MergeIntervalsTemplate`
2. `PT2OverlapCountingTemplate`
3. `PT3SweepLineTemplate`

## PT1 `PT1MergeIntervalsTemplate`

- Solves: merge overlapping ranges and insert a new interval into a sorted list.
- Identify: overlapping intervals should collapse into one bigger interval.
- Typical LeetCode problems: `Merge Intervals`, `Insert Interval`.
- Reminder: sort by start time first unless input is already guaranteed sorted.

## PT2 `PT2OverlapCountingTemplate`

- Solves: count conflicts, remove minimum overlaps, track active overlap amount.
- Identify: you care about how many intervals clash, not necessarily the merged output itself.
- Typical LeetCode problems: `Non-overlapping Intervals`, `Meeting Rooms II` count view.
- Reminder: sometimes the answer is the number removed, not the merged list.

## PT3 `PT3SweepLineTemplate`

- Solves: event-based interval processing with starts and ends.
- Identify: turning boundaries into sorted events simplifies the problem.
- Typical LeetCode problems: skyline-style thinking, `Meeting Rooms II`, maximum overlap tasks.
- Reminder: sweep line is powerful when direct pairwise comparison is too slow.