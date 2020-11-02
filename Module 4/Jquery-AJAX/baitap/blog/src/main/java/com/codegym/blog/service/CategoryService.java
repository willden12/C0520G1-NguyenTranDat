package com.codegym.blog.service;

import com.codegym.blog.model.Category;

public interface CategoryService {
    Iterable<Category> findAll();

    void saveAndUpdate(Category category);

    Category findById(int id);

    void delete(int id);
}
