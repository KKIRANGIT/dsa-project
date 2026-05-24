package com.practice.dsa.designpatterns.enterprise;

import java.util.HashMap;
import java.util.Map;

/**
 * Repository hides persistence details behind a domain-friendly interface.
 *
 * Use this when:
 * - business code should not know storage details
 * - data access should be centralized
 */
public class EP1RepositoryPattern {
    // Domain object.
    static class User {
        final int id;
        final String name;

        User(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    // Repository interface hides storage details from business code.
    interface UserRepository {
        void save(User user);
        User findById(int id);
    }

    // One simple in-memory implementation for teaching/demo purposes.
    static class InMemoryUserRepository implements UserRepository {
        private final Map<Integer, User> storage = new HashMap<>();

        public void save(User user) {
            storage.put(user.id, user);
        }

        public User findById(int id) {
            return storage.get(id);
        }
    }

    public static void main(String[] args) {
        // Caller talks to repository, not directly to maps or database APIs.
        UserRepository repository = new InMemoryUserRepository();
        repository.save(new User(1, "Alice"));
        System.out.println(repository.findById(1).name);
    }
}
