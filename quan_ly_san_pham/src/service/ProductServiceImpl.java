package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Nokia 1200", "10000", "Trắng", "nokia"));
        products.put(2, new Product(2, "Samsung 6300", "8000", "Xanh", "Samsung"));
        products.put(3, new Product(3, "Iphone 12", "20000", "Đỏ", "Iphone"));
        products.put(4, new Product(4, "Xiaomi note", "4000", "Tím", "Xiaomi"));
        products.put(5, new Product(5, "BenQ 23", "12000", "Vàng", "BenQ"));
        products.put(6, new Product(6, "Vetu 54", "100000", "Bầm", "Vetu"));
        products.put(7, new Product(7, "Huwel 42", "20000", "Hườm", "Huwel"));

    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
