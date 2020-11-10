package com.codegym.casestady4.service;

import com.codegym.casestady4.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findByIdAndName(String inputSearch, Pageable pageable);

    Iterable<Customer> findAll();

    Customer findById(String id);

    void save(Customer customer);

    void delete(String id);

    Page<Customer> search(String input, Pageable pageable);

    List<Customer> searchAllField(String name, String birthday, String phone, String email, String address, String idCard, int type, String id);
}
