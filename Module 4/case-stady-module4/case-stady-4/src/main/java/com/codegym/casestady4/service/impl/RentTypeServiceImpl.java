package com.codegym.casestady4.service.impl;

import com.codegym.casestady4.model.RentType;
import com.codegym.casestady4.repository.RentTypeRepository;
import com.codegym.casestady4.service.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImpl implements RentTypeService {
    @Autowired
    private RentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
