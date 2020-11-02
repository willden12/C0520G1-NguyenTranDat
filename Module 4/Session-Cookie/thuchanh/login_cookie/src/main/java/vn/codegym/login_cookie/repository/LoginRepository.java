package vn.codegym.login_cookie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.login_cookie.model.User;

public interface LoginRepository extends JpaRepository<User, Integer> {
}
