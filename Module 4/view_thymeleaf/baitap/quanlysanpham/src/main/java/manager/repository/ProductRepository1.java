package manager.repository;

import manager.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductRepository1 {
    List<String> getProductType();

    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
