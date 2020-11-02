package vn.codegym.login_cookie.service;

import vn.codegym.login_cookie.model.User;

public interface LoginService {
    Iterable<User> findAll();

    void save(User user);

    User findById(int id);
}
