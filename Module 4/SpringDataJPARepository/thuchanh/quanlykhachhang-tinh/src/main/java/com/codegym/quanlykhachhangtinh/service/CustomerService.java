package com.codegym.quanlykhachhangtinh.service;

import com.codegym.quanlykhachhangtinh.model.Customer;
import com.codegym.quanlykhachhangtinh.model.Province;

public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}
