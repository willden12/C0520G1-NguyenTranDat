package com.codegym.quanlykhachhang.repository;

import com.codegym.quanlykhachhang.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
