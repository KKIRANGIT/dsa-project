# Advanced Graph Patterns

## What This Folder Covers

Use this folder when plain DFS/BFS is not enough and the graph requires weighted shortest path, SCC, flow, or advanced structure.

## How To Identify This Topic

Pick this topic when you see signals like:

- weighted shortest path
- negative edges
- minimum spanning tree
- strongly connected components
- path state includes keys, masks, or fuel
- all-pairs shortest path or max flow

## Study Order

1. `PT1DijkstraTemplate`
2. `PT2BellmanFordTemplate`
3. `PT3PrimTemplate`
4. `PT4UnionFindGraphTemplate`
5. `PT5TarjanSccTemplate`
6. `PT6DagDpTemplate`
7. `PT7ShortestPathWithStateTemplate`
8. `PT8EulerianPathTemplate`
9. `PT9FloydWarshallTemplate`
10. `PT10DinicMaxFlowTemplate`

## PT1 `PT1DijkstraTemplate`

- Solves: shortest paths with non-negative weights.
- Identify: edge weights exist and you need the cheapest path, not just the fewest edges.
- Typical LeetCode problems: `Network Delay Time`, `Path With Minimum Effort`, `Cheapest Flights Within K Stops` partial relation.
- Reminder: once the minimum-distance node is finalized, Dijkstra never needs to improve it again.

## PT2 `PT2BellmanFordTemplate`

- Solves: shortest paths with negative edges and repeated edge relaxation.
- Identify: negative edges are allowed or the problem is naturally expressed as repeated relaxations.
- Typical LeetCode problems: `Cheapest Flights Within K Stops` DP/relaxation view, negative-edge shortest path variants.
- Reminder: Bellman-Ford is slower than Dijkstra but handles cases Dijkstra cannot.

## PT3 `PT3PrimTemplate`

- Solves: minimum spanning tree by growing one connected component.
- Identify: you must connect all points/nodes with minimum total cost.
- Typical LeetCode problems: `Min Cost to Connect All Points`, classic MST tasks.
- Reminder: Prim greedily adds the cheapest edge from the built tree to an outside node.

## PT4 `PT4UnionFindGraphTemplate`

- Solves: MST with Kruskal, connectivity, redundant edge detection.
- Identify: repeated connectivity checks or cycle detection among added edges.
- Typical LeetCode problems: `Redundant Connection`, `Min Cost to Connect All Points` Kruskal view, dynamic connectivity tasks.
- Reminder: DSU is about merging components and checking whether two nodes already share one.

## PT5 `PT5TarjanSccTemplate`

- Solves: strongly connected components in directed graphs.
- Identify: mutual reachability groups matter more than simple traversal.
- Typical LeetCode problems: SCC-style hard graph tasks, condensation graph reasoning.
- Reminder: discovery indices and low links tell you when a full SCC closes.

## PT6 `PT6DagDpTemplate`

- Solves: DP over a DAG after topological ordering.
- Identify: dependencies form a DAG and answers flow along edges.
- Typical LeetCode problems: `Largest Color Value in a Directed Graph` DAG view, path DP on DAGs.
- Reminder: once topo order is known, transition order becomes safe.

## PT7 `PT7ShortestPathWithStateTemplate`

- Solves: shortest path where node alone is not enough and extra state matters.
- Identify: position plus keys, mask, fuel, parity, or used-stops count defines the true state.
- Typical LeetCode problems: `Shortest Path to Get All Keys`, `Cheapest Flights Within K Stops`, obstacle-elimination paths.
- Reminder: visited state must include both location and the extra condition.

## PT8 `PT8EulerianPathTemplate`

- Solves: use every edge exactly once.
- Identify: itinerary or edge-usage problems where edge consumption is mandatory.
- Typical LeetCode problems: `Reconstruct Itinerary`, Eulerian trail/circuit tasks.
- Reminder: Eulerian path is about edges, not just nodes.

## PT9 `PT9FloydWarshallTemplate`

- Solves: all-pairs shortest path on small graphs.
- Identify: many source-target distance queries exist and graph size is small enough for O(n^3).
- Typical LeetCode problems: smaller all-pairs path tasks, transitive-closure style problems.
- Reminder: Floyd-Warshall is simple but only practical on smaller `n`.

## PT10 `PT10DinicMaxFlowTemplate`

- Solves: max flow, min cut, matching reductions.
- Identify: capacities and flow conservation are the core model.
- Typical LeetCode problems: harder specialized interview tasks, bipartite matching reductions, network capacity problems.
- Reminder: this is advanced and usually appears only in stronger or niche rounds.