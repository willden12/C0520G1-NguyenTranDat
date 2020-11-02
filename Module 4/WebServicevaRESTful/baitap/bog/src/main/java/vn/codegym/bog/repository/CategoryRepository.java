package vn.codegym.bog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.bog.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
