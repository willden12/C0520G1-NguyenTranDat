package com.codegym.ungdungblog.service;

import com.codegym.ungdungblog.model.Category;

public interface CategoryService {
    Iterable<Category> findAll();

    void saveAndUpdate(Category category);

    Category findById(int id);

    void delete(int id);
}
