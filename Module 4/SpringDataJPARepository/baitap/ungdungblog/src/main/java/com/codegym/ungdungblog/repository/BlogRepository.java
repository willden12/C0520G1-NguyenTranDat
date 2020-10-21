package com.codegym.ungdungblog.repository;

import com.codegym.ungdungblog.model.Blog;
import com.codegym.ungdungblog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findBlogByBlogTitleContaining (String name, Pageable pageable);

    Iterable<Blog> findBlogByBlogCategory (Category category);
}
