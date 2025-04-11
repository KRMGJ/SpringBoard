package com.example.app.service.serviceImpl;

import com.example.app.dao.UserDao;
import com.example.app.model.User;
import com.example.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    HttpSession session;

    @Override
    public void signUp(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Override
    public void deleteUser(String userId) {
        userDao.delete(userId);
    }

    @Override
    public User getUserByUserId(String userId) {
        return userDao.findByUserId(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }
}
