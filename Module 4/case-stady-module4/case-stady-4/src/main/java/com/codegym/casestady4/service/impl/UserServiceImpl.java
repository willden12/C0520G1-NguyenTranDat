package com.codegym.casestady4.service.impl;

import com.codegym.casestady4.model.User;
import com.codegym.casestady4.repository.UserRepository;
import com.codegym.casestady4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserByUserName(String input) {
        return userRepository.findByUserName(input);
    }
}
