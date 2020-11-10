package vn.codegym.castady.service;


import vn.codegym.castady.model.User;

public interface UserService {
    User findUserByUserName(String input);
}
