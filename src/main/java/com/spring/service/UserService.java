package com.spring.service;

import com.spring.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();

    User findById(Long id);

    void deleteUser(Long id);

    void saveUser(User user);
}