package com.codegym.casestady4.repository;

import com.codegym.casestady4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUserName (String userName);
}
