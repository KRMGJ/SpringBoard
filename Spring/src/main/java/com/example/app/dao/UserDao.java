package com.example.app.dao;

import com.example.app.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    User findByUserId(String userId);
    List<User> findAll();
    void update(User user);
    void delete(String userId);
}
