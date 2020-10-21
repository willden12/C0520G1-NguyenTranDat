package com.codegym.ungdungblog.service;

import com.codegym.ungdungblog.model.Blog;
import com.codegym.ungdungblog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(int id);

    void save(Blog blog);

    void delete(int id);

    Page<Blog> findByTitle(String name, Pageable pageable);

    Iterable<Blog> findByCategory(Category category);
}
