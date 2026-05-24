# Graph Patterns

## What This Folder Covers

Use this folder when nodes and edges or grid adjacency define the structure.

## How To Identify This Topic

Pick this topic when you see signals like:

- connected components
- shortest path in an unweighted graph
- prerequisites or dependency order
- cycle checks
- flood fill or island traversal

## Study Order

1. `PT1GraphDfsTemplate`
2. `PT2GraphBfsTemplate`
3. `PT3MatrixBfsTemplate`
4. `PT4MultiSourceBfsTemplate`
5. `PT5TopologicalSortTemplate`
6. `PT6CycleDetectionTemplate`
7. `PT7BipartiteCheckTemplate`
8. `PT8BridgeFindingTemplate`

## PT1 `PT1GraphDfsTemplate`

- Solves: connected components, reachability, exhaustive traversal.
- Identify: you need to visit everything connected to a start node.
- Typical LeetCode problems: `Number of Connected Components in an Undirected Graph`, `Clone Graph`, `Number of Islands` DFS view.
- Reminder: DFS is about going deep first and marking visited nodes.

## PT2 `PT2GraphBfsTemplate`

- Solves: shortest path in unweighted graphs and level-by-level exploration.
- Identify: every edge has equal cost and the first time you reach a node matters.
- Typical LeetCode problems: `Word Ladder`, `Open the Lock`, `Shortest Path in Binary Matrix` graph view.
- Reminder: BFS gives shortest edge count in unweighted graphs.

## PT3 `PT3MatrixBfsTemplate`

- Solves: grid shortest paths and wave expansion on matrices.
- Identify: movement happens in up/down/left/right directions with boundaries.
- Typical LeetCode problems: `Rotting Oranges`, `01 Matrix`, `Shortest Path in Binary Matrix`.
- Reminder: treat each valid cell as a graph node.

## PT4 `PT4MultiSourceBfsTemplate`

- Solves: simultaneous expansion from many starting points.
- Identify: several starting cells or nodes influence the answer at once.
- Typical LeetCode problems: `Rotting Oranges`, `Walls and Gates`, `01 Matrix`.
- Reminder: push all initial sources into the queue before the BFS begins.

## PT5 `PT5TopologicalSortTemplate`

- Solves: prerequisite order and DAG linearization.
- Identify: the graph is directed and one task must happen before another.
- Typical LeetCode problems: `Course Schedule II`, `Alien Dictionary`, `Parallel Courses`.
- Reminder: topo sort only works on DAGs.

## PT6 `PT6CycleDetectionTemplate`

- Solves: detecting cycles in directed or undirected graphs.
- Identify: the problem asks whether dependencies are valid or whether a traversal loops back.
- Typical LeetCode problems: `Course Schedule`, `Redundant Connection`, `Graph Valid Tree` reasoning.
- Reminder: the cycle-check method depends on graph type.

## PT7 `PT7BipartiteCheckTemplate`

- Solves: split graph into two groups with no same-group conflicts.
- Identify: the question describes two teams, two colors, or dislike constraints.
- Typical LeetCode problems: `Is Graph Bipartite?`, `Possible Bipartition`.
- Reminder: alternate colors while traversing and fail on color conflicts.

## PT8 `PT8BridgeFindingTemplate`

- Solves: find critical edges whose removal disconnects the graph.
- Identify: the problem asks which connection is critical for connectivity.
- Typical LeetCode problems: `Critical Connections in a Network`.
- Reminder: discovery time and low-link values are the core idea.