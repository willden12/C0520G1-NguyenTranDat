package com.codegym.validateform.repository;

import com.codegym.validateform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
