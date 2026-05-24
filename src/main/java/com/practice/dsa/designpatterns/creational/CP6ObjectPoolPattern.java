package com.practice.dsa.designpatterns.creational;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Object Pool reuses a small set of expensive objects instead of constantly creating and discarding them.
 *
 * Use this when:
 * - objects are expensive to create
 * - objects can be reset and safely reused
 * - only a limited number should exist at once
 */
public class CP6ObjectPoolPattern {
    static class Connection {
        private final int id;

        Connection(int id) {
            this.id = id;
        }

        void query(String sql) {
            System.out.println("Connection " + id + " running: " + sql);
        }
    }

    static class ConnectionPool {
        // Queue holds currently unused reusable objects.
        private final Queue<Connection> available = new ArrayDeque<>();

        ConnectionPool(int size) {
            for (int id = 1; id <= size; id++) {
                available.offer(new Connection(id));
            }
        }

        Connection acquire() {
            // Take one reusable object out of the pool.
            Connection connection = available.poll();
            if (connection == null) {
                throw new IllegalStateException("No pooled connections available");
            }
            return connection;
        }

        void release(Connection connection) {
            // Return the object so future callers can reuse it.
            available.offer(connection);
        }
    }

    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool(2);
        // Borrow one connection, use it, then return it.
        Connection connection = pool.acquire();
        connection.query("select * from users");
        pool.release(connection);
    }
}
