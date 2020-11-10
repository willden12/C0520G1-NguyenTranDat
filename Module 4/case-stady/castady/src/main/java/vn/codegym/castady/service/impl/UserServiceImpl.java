package vn.codegym.castady.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.castady.model.User;
import vn.codegym.castady.repository.UserRepository;
import vn.codegym.castady.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserByUserName(String input) {
        return userRepository.findByUserName(input);
    }
}
