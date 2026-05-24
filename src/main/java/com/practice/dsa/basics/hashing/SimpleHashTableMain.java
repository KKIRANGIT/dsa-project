package com.practice.dsa.basics.hashing;

public class SimpleHashTableMain {
    public static void main(String[] args) {
        // Capacity is intentionally small so collisions are easier to imagine.
        SimpleHashTable table = new SimpleHashTable(5);

        table.put(10, 100);
        table.put(15, 150);
        table.put(20, 200);

        // 10, 15, and 20 all map into the table through the hash function.
        System.out.println("get(10) = " + table.get(10));
        System.out.println("get(15) = " + table.get(15));
        System.out.println("remove(15) = " + table.remove(15));
        System.out.println("get(15) after remove = " + table.get(15));
    }
}
