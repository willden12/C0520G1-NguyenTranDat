package com.codegym.quanlykhachhangtinh.service;


import com.codegym.quanlykhachhangtinh.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Customer findOne(int id);

    void save(Customer customer);

    void delete(int id);

    long size();
}
