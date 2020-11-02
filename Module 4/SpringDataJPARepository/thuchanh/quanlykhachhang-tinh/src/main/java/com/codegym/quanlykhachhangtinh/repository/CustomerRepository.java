package com.codegym.quanlykhachhangtinh.repository;


import com.codegym.quanlykhachhangtinh.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
