# How To Read This Code

If you are new, use this method for every solver file.

## Step 1

Read the class-level comment first.

That tells you:
- what the problem is asking
- what idea solves it
- what data structure is being used

## Step 2

Find the main variables.

Examples:
- `left`, `right`: usually pointers or a window
- `stack`: tracks unfinished work
- `queue`: BFS traversal order
- `map`: fast lookup
- `dp`: cached answers for subproblems

## Step 3

Read the loop slowly.

Ask:
- what changes each iteration?
- what condition causes movement?
- what invariant is always true?

## Step 4

Run the matching `Main` file and debug line by line.

That is more useful than reading the answer passively.

## Step 5

After understanding the code, try to say the algorithm in plain English without looking.

If you cannot explain it simply, you do not own it yet.
