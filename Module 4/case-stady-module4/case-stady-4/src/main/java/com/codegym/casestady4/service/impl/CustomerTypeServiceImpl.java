package com.codegym.casestady4.service.impl;

import com.codegym.casestady4.model.CustomerType;
import com.codegym.casestady4.repository.CustomerTypeRepository;
import com.codegym.casestady4.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
