package vn.codegym.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
