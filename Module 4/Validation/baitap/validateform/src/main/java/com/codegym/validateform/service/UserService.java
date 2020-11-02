package com.codegym.validateform.service;


import com.codegym.validateform.model.User;

public interface UserService {
    Iterable<User> findAll();

    void save(User user);
}
