package vn.codegym.castady.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.castady.model.Division;

public interface DivisionRepository extends JpaRepository<Division, Long> {
}