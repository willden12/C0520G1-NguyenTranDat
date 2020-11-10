package com.codegym.casestady4.service.impl;

import com.codegym.casestady4.model.Customer;
import com.codegym.casestady4.repository.CustomerRepository;
import com.codegym.casestady4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findByIdAndName(String inputSearch, Pageable pageable) {
        return customerRepository.findCustomerByCustomerIdContainingOrCustomerNameContaining(inputSearch, inputSearch, pageable);
    }

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(String id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> search(String input, Pageable pageable) {
        return customerRepository.search(input, pageable);
    }

    @Override
    public List<Customer> searchAllField(String name, String birthday, String phone, String email, String address, String idCard, int type, String id) {
        return customerRepository.searchAllField(name, birthday, phone, email, address, idCard, type, id);
    }
}
