package com.codegym.quanlykhachhangtinh.repository;

import com.codegym.quanlykhachhangtinh.model.Customer;
import com.codegym.quanlykhachhangtinh.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
