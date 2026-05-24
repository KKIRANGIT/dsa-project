package com.practice.dsa.basics.unionfind;

public class UnionFindMain {
    public static void main(String[] args) {
        // Create Union Find for nodes 0 to 5.
        UnionFind unionFind = new UnionFind(6);
        // Merge a few groups.
        // 0, 1, and 2 become one connected component.
        unionFind.union(0, 1);
        unionFind.union(1, 2);
        // 4 and 5 become a separate connected component.
        unionFind.union(4, 5);

        // 0 and 2 belong to the same group.
        System.out.println("0 connected to 2 = " + unionFind.connected(0, 2));
        // 2 and 5 belong to different groups.
        System.out.println("2 connected to 5 = " + unionFind.connected(2, 5));
    }
}
