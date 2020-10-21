package manager.service;

import org.springframework.stereotype.Service;
import manager.model.Product;
import manager.repository.ProductRepository1;
import manager.repository.ProductRepositoryImpl1;

import java.util.List;

@Service
public class ProductServiceImpl1 implements ProductService1 {
    private ProductRepository1 productRepository = new ProductRepositoryImpl1();

    @Override
    public List<String> getProductType() {
        return productRepository.getProductType();
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id, product);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }
}
