package com.practice.dsa.basics.hashing;

/**
 * Beginner custom hash table reference.
 *
 * This version uses:
 * - integer keys
 * - integer values
 * - separate chaining with linked nodes inside each bucket
 *
 * This is intentionally small and educational.
 *
 * Important beginner idea:
 * different keys can land in the same bucket.
 * That is why each bucket can hold a linked list of entries.
 */
public class SimpleHashTable {
    private static class Entry {
        int key;
        int value;
        Entry next;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final Entry[] buckets;

    public SimpleHashTable(int capacity) {
        this.buckets = new Entry[capacity];
    }

    public void put(int key, int value) {
        int index = indexFor(key);
        Entry current = buckets[index];

        while (current != null) {
            if (current.key == key) {
                // Key already exists, so overwrite the old value.
                current.value = value;
                return;
            }
            current = current.next;
        }

        // Insert new entry at the front of this bucket chain.
        Entry entry = new Entry(key, value);
        entry.next = buckets[index];
        buckets[index] = entry;
    }

    public Integer get(int key) {
        int index = indexFor(key);
        Entry current = buckets[index];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    public boolean remove(int key) {
        int index = indexFor(key);
        Entry current = buckets[index];
        Entry previous = null;

        while (current != null) {
            if (current.key == key) {
                if (previous == null) {
                    buckets[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                return true;
            }
            previous = current;
            current = current.next;
        }

        return false;
    }

    private int indexFor(int key) {
        // Compress any integer key into a valid bucket index.
        return Math.abs(key) % buckets.length;
    }
}
