package com.spring.dao;

import com.spring.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void saveUser(User user);

    void deleteUser(Long id);

    User findById(Long id);
}
