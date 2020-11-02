package vn.codegym.demo.service;

import vn.codegym.demo.model.Product;

public interface ProductService {
    Iterable<Product> findAll();

    Product findById(long id);

    void save(Product product);

    void delete(long id);
}
