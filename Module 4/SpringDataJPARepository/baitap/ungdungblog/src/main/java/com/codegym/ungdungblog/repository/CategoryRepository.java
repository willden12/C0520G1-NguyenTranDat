package com.codegym.ungdungblog.repository;

import com.codegym.ungdungblog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
