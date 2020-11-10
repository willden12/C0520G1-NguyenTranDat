package com.codegym.casestady4.service;

import com.codegym.casestady4.model.User;

public interface UserService {
    User findUserByUserName(String input);
}
