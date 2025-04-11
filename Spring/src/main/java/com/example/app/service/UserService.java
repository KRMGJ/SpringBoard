package com.example.app.service;

import com.example.app.model.User;

import java.util.List;

public interface UserService {
    void signUp(User user);
    void updateUser(User user);
    void deleteUser(String userId);
    User getUserByUserId(String userId);
    List<User> getAllUsers();
}
