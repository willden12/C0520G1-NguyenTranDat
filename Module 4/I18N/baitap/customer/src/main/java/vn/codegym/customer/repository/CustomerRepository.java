package vn.codegym.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
