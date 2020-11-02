package vn.codegym.bog.service;

import vn.codegym.bog.model.Category;

public interface CategoryService {
    Iterable<Category> findAll();

    void saveAndUpdate(Category category);

    Category findById(int id);

    void delete(int id);
}
