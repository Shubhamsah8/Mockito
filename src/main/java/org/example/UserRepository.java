package org.example;

public interface UserRepository {
    User findByUsername(String username);
    void save(User user);
}
