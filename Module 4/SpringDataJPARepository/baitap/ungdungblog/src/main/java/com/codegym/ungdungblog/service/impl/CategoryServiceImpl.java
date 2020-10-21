package com.codegym.ungdungblog.service.impl;

import com.codegym.ungdungblog.model.Category;
import com.codegym.ungdungblog.repository.CategoryRepository;
import com.codegym.ungdungblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void saveAndUpdate(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        categoryRepository.deleteById(id);
    }
}
