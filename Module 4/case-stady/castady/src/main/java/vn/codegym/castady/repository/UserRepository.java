package vn.codegym.castady.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.castady.model.User;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUserName(String userName);
}
